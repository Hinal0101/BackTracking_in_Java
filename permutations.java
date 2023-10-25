package BackTracking_in_Java;

public class permutations {
    public static void print_perm(String str,String perm,int idx){
    if(str.length()==0){
        System.out.println(perm);
        return;
    }
    for(int i=0;i<str.length();i++){
        char currchar=str.charAt(i);
        String newstr=str.substring(0, i)+str.substring(i+1);
        print_perm(newstr, perm+currchar, idx+1);
    }
}
    public static void main(String args[]){
        String str="ABC";
        print_perm(str, "", 0);
    }
}
