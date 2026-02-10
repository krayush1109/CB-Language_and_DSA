class  _04_LengthWiseSubStr{

    public static void main(String[] args) {
        
        String s = "abcd";

        lengthWiseSubStr(s);

    }

    public static void lengthWiseSubStr(String s) {
        
        for(int i=1; i<s.length(); i++){ // traverse from length 1,2,3,... till length of string

            int diff = 1;
            
            for(int j=0; j<s.length(); j++){    // starting point

                System.out.println(s.substring(j, j+i));

            }

        }

    }

}