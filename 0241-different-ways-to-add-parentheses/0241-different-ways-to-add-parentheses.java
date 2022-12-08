class Solution {
    public List<Integer> diffWaysToCompute(String input) {
    List<Integer> result=new ArrayList<>();
    if(input==null||input.length()==0)  return result;
    List<String> ops=new ArrayList<>();
    for(int i=0; i<input.length(); i++){
        int j=i;
        while(j<input.length()&&Character.isDigit(input.charAt(j)))
            j++;
        String num=input.substring(i, j);
        ops.add(num);
        if(j!=input.length())   ops.add(input.substring(j, j+1));
        i=j;
    }
    result=compute(ops, 0, ops.size()-1);
    return result;
}
private List<Integer> compute(List<String> ops, int lo, int hi){
    List<Integer> result=new ArrayList<>();
    if(lo==hi){
        Integer num=Integer.valueOf(ops.get(lo));
        result.add(num);
        return result;
    }
    for(int i=lo+1; i<=hi-1; i=i+2){
        String operator=ops.get(i);
        List<Integer> left=compute(ops,lo, i-1), right=compute(ops, i+1, hi);
        for(int leftNum:left)
            for(int rightNum: right){
                if(operator.equals("+"))
                    result.add(leftNum+rightNum);
                else if(operator.equals("-"))
                    result.add(leftNum-rightNum);
                else
                    result.add(leftNum*rightNum);
            }
    }
    return result;
}

}