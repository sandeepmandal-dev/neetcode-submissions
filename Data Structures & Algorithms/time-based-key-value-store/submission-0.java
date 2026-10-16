class TimeMap {
    private Map<String, List<int[]>> map;
    private Map<String, List<String>> values;
    public TimeMap() {
        map = new HashMap<>();
        values = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,k-> new ArrayList<>())
           .add(new int[]{timestamp});
        values.computeIfAbsent(key,k-> new ArrayList<>())
           .add(value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }

        List<int[]> timestamps = map.get(key);
        List<String> storedValues = values.get(key);

        int left = 0;
        int right = timestamps.size()-1;
        int answer = -1;
        while(left<=right){
          int mid = left + (right - left)/2;
          if(timestamps.get(mid)[0]<=timestamp){
            answer = mid;
            left = mid+1;
          }else{
            right=mid-1;
          }

        }
        return answer == -1 ? "" : storedValues.get(answer);
    }
}