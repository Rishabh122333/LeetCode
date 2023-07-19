class Solution {
    //formula h 2*(numrows-1) for first and last row and isme 2 kam krte jaao for non border rows
    // formula for non border 2*(numrows-1)-2*r where r is current row no.
    public String convert(String s, int numrows) {
        int n=s.length();
        if(numrows==1)
            return s;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<numrows;i++)
        {
            int skip=2*(numrows-1);
            for(int j=i;j<n;j+=skip)
            {
                sb.append(s.charAt(j));
                if(i>0 && i<numrows-1 && (j+skip-2*i<n))
                    sb.append(s.charAt(j+skip-2*i));
            }
        }
        return sb.toString();
    }
}