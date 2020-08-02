import java.util.List;
import java.util.ArrayList;
class Test2 {

    public static void main(String[] args) {
        List<List<Integer>> forwardRouteList = new ArrayList<List<Integer>>();
        List<List<Integer>> returnRouteList  = new ArrayList<List<Integer>>();
        
        
        List<Integer> forward = new ArrayList<Integer>();
        forward.add(1);
        forward.add(3000);
        forwardRouteList.add(forward);
        forward = new ArrayList<Integer>();
        forward.add(2);
        forward.add(5000);
        forwardRouteList.add(forward);
        forward = new ArrayList<Integer>();
        forward.add(3);
        forward.add(7000);
        forwardRouteList.add(forward);
        forward = new ArrayList<Integer>();
        forward.add(4);
        forward.add(10000);
        forwardRouteList.add(forward);
        List<Integer> returnr = new ArrayList<Integer>();
        returnr.add(1);
        returnr.add(2000);
        returnRouteList.add(returnr);
        returnr = new ArrayList<Integer>();
        returnr.add(2);
        returnr.add(3000);
        returnRouteList.add(returnr);
        returnr = new ArrayList<Integer>();
        returnr.add(3);
        returnr.add(4000);
        returnRouteList.add(returnr);
        returnr = new ArrayList<Integer>();
        returnr.add(4);
        returnr.add(5000);
        returnRouteList.add(returnr);
        optimalUtilization(7000, forwardRouteList, returnRouteList);
    }

    public static List<List<Integer>> optimalUtilization(int maxTravelDist, 
                                    List<List<Integer>> forwardRouteList,
                                    List<List<Integer>> returnRouteList)
	{
	    List<List<Integer>> res = new ArrayList<List<Integer>>();
	    int lookingFor;
        int closest = maxTravelDist;
        List<Integer> store= new ArrayList<Integer>();;
	    for(int i=0; i<forwardRouteList.size(); i++){
	        for(int j=0; j<returnRouteList.size(); j++){
                lookingFor = maxTravelDist-forwardRouteList.get(i).get(1);
                System.out.println(maxTravelDist);
                System.out.println(lookingFor);
	            if(lookingFor<=0)
	                break;
	            if(returnRouteList.get(j).get(1) == lookingFor){
                    System.out.print(returnRouteList.get(i).get(1));
                    System.out.print(" ");
                    System.out.println(returnRouteList.get(j).get(1));
	                List<Integer> add = new ArrayList<Integer>();
	                add.add(forwardRouteList.get(i).get(0));
	                add.add(returnRouteList.get(j).get(0));
	                res.add(add);
	            } else if((returnRouteList.get(j).get(1)-lookingFor)<closest){
                    store = new ArrayList<Integer>();
	                store.add(forwardRouteList.get(i).get(0));
	                store.add(returnRouteList.get(j).get(0)); 
                }
	        }
        }
        if(res.size()==0){
            res.add(store);
        }
	    return res;
    }
    
    

}