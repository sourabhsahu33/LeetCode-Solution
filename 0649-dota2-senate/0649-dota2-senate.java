class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        int n = senate.length();
        for(int i=0; i<n; i++){
            if(senate.charAt(i)=='R'){
                qr.offer(i);
            }else{
                qd.offer(i);
            }
        }
        while(!qr.isEmpty()&& !qd.isEmpty()){
            int rid = qr.poll();
            int did = qd.poll();
            if(rid<did)
                qr.offer(rid+n);
            else
                qd.offer(did+n);
        }
        return (qr.size()> qd.size())? "Radiant": "Dire";
    }
}