class UndergroundSystem {

    private Map<Integer,Station> map;
    private Map<String,List<Double>> avgTime;
    private double average;
    public UndergroundSystem() {
        this.map = new HashMap<>();
        this.avgTime = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        if(map.containsKey(id)) return;
        
        map.put(id, new Station(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
         if(!map.containsKey(id)) return;
      
         Station station = map.get(id);
         
         map.remove(id);
      
         String sName = station.getStationName() +"X"+ stationName;
         int time = t - station.getT();
      
        if(avgTime.containsKey(sName)){
          List<Double> list = avgTime.get(sName);
           System.out.println("Time" + time);
          list.add((double)time);
          avgTime.put(sName,list);
        }else{
          List<Double> list = new ArrayList<>();
          list.add((double)time);
          avgTime.put(sName,list);
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
         String sName = startStation +"X"+ endStation;
      
      if(avgTime.containsKey(sName)){
         List<Double> list = avgTime.get(sName);
         double sum = 0;
         System.out.println(list);
         for(Double num : list){
           sum += num;
         }
        System.out.println(sum);
        return sum/list.size();
         
      }else{
        return 0.0;
      }
    }
  
  class Station{
    private String stationName;
    private int t;
    
    public Station(String stationName, int t){
      this.stationName = stationName;
      this.t = t;
    }
    
    public String getStationName(){
      return this.stationName;
    }
    
    public int getT(){
      return this.t;
    }
    
    public void setStationName(String stationName){
      this.stationName = stationName;
    }
    
    public void setT(int t){
      this.t = t;
    }

  }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */