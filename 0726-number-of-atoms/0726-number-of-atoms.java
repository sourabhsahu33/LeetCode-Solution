class Solution {
    public String countOfAtoms(String formula) {
        int n = formula.length();
        Map<String, Integer> res = new HashMap<>();
        Deque<Map<String, Integer>> p_stack = new ArrayDeque<>();
        int idx = 0;

        while (idx < n) {
            char cur_char = formula.charAt(idx);

            if (cur_char == '(') {
                idx++;
                p_stack.push(new HashMap<>());
                continue;
            }

            if (cur_char == ')') {
                StringBuilder mult_str = new StringBuilder();
                idx++;

                while (idx < n && Character.isDigit(formula.charAt(idx))) {
                    mult_str.append(formula.charAt(idx));
                    idx++;
                }

                int mult = mult_str.length() == 0 ? 1 : Integer.parseInt(mult_str.toString());
                Map<String, Integer> last_counter = p_stack.pop();
                Map<String, Integer> target = p_stack.isEmpty() ? res : p_stack.peek();
                
                for (Map.Entry<String, Integer> entry : last_counter.entrySet()) {
                    target.put(entry.getKey(), target.getOrDefault(entry.getKey(), 0) + entry.getValue() * mult);
                }
                continue;
            }

            StringBuilder cur_elem = new StringBuilder();
            StringBuilder cur_counter_str = new StringBuilder();
            Map<String, Integer> target = p_stack.isEmpty() ? res : p_stack.peek();

            while (idx < n && formula.charAt(idx) != '(' && formula.charAt(idx) != ')') {
                if (Character.isAlphabetic(formula.charAt(idx))) {
                    if (Character.isUpperCase(formula.charAt(idx)) && cur_elem.length() > 0) {
                        target.put(cur_elem.toString(), target.getOrDefault(cur_elem.toString(), 0) + (cur_counter_str.length() == 0 ? 1 : Integer.parseInt(cur_counter_str.toString())));
                        cur_elem = new StringBuilder();
                        cur_counter_str = new StringBuilder();
                    }
                    cur_elem.append(formula.charAt(idx));
                } else {
                    cur_counter_str.append(formula.charAt(idx));
                }
                idx++;
            }

            target.put(cur_elem.toString(), target.getOrDefault(cur_elem.toString(), 0) + (cur_counter_str.length() == 0 ? 1 : Integer.parseInt(cur_counter_str.toString())));
        }

        List<String> parts = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : res.entrySet()) {
            parts.add(entry.getKey() + (entry.getValue() == 1 ? "" : entry.getValue()));
        }
        Collections.sort(parts);

        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part);
        }

        return result.toString();
    }
}