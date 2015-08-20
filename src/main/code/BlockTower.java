package code;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: mmandam
 * Date: 3/8/13
 * Time: 12:12 PM
 * To change this template use File | Settings | File Templates.
 */

public class BlockTower {

    public int getTallest(int[] blockHeights) {
        int[] blockHeightsEven = new int[blockHeights.length];
        int[] blockHeightsOdd = new int[blockHeights.length];

        //Split the boxes into even and odd arrays
        for (int i = 0; i < blockHeights.length; i++) {
            if (blockHeights[i] / 2 == 0) {
                blockHeightsEven[i] = blockHeights[i];
            } else {
                blockHeightsOdd[i] = blockHeights[i];
            }
        }

        //Sort the Arrays
        Arrays.sort(blockHeightsEven);
        Arrays.sort(blockHeightsOdd);

        int towerHeight = 0;
        for (int j = 0; j < blockHeightsEven.length; j++) {
            towerHeight = towerHeight + blockHeightsEven[j];
        }

        int lastEvenBlock = blockHeightsEven[blockHeightsEven.length -1];

        findOddBlock(0, blockHeightsOdd.length-1, lastEvenBlock, blockHeightsOdd);

        return towerHeight;
    }

    private int findOddBlock(int i, int j, int lastEvenBlock, int[] blockHeightOdd) {

        //This needs to be updated
        //Find a number using binary search.
        //If number found, return the next number
        // else nothing
        if(i==j)return i;

        int r = (i+j)/2;


        if(blockHeightOdd[r]> lastEvenBlock){
            return findOddBlock (i, r, lastEvenBlock, blockHeightOdd) ;
        }

       else if(blockHeightOdd[r]< lastEvenBlock){
           return  findOddBlock (r, j, lastEvenBlock, blockHeightOdd) ;
        }

        return 0;
    }

}
