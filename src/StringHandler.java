class StringHandler {
    public static String ContainNumRom(String line){
        char[] chars = line.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char c : chars){
           if(!Character.isDigit(c)){
              result.append(c);
           }
        }
        return result.toString();
    }       
}
