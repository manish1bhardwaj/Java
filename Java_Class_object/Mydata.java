public class Mydata {
    private String data;
    
    public String getData(){
        return data;
    }    
    public void setData(String data){
        this.data = data;

    }
    //method to print triangle
    public void StringTriangle(){
        StringBuilder sb = new StringBuilder();
        if (data==null){
            System.out.println("Data is null");
            return;
        }
        for(int x=0;x<data.length();x++){
            char v=data.charAt(x);
            sb.append(v);
            String xx = sb.toString();
            System.err.println("xx");
        }
        





    //method to print all vowels    
    public void printAllVowels(){
        if (data==null){
            System.out.println("Data is null");
            return;
        }
    {
        data=data.toLowerCase();
        for(int x = 0;x<data.length();x++)
        {
            char v=data.charAt(x);
            if (v=='a'||v=='e'||v=='i'||v=='o'||v=='u'){
                System.out.println(v);
            }

        }
    }
}
}
