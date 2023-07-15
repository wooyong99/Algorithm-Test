import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int [] rs1=new int [commands.length];
        int rs_count=0;
        for(int i=0; i <commands.length;i++){
            int count =0;
            int [] rs=new int[(commands[i][1]-commands[i][0])+1];
            for(int s=(commands[i][0])-1; s<commands[i][1];s++){
                rs[count]=array[s];
                count++;
            }
            Arrays.sort(rs);
            rs1[rs_count]=rs[commands[i][2]-1];
            rs_count++;
        }
        return rs1;
    }
}