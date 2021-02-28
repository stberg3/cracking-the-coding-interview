package stackqueue;

/**
 * Describe how you could use a single array to implement three stacks
 */
class _03_01_ThreeInOne {

    int[] idx;
    int space;
    int[] arr;

    _03_01_ThreeInOne(int initSize) {
        this.arr = new int[initSize*3];
        this.space = initSize;
        this.idx = new int[3];
    }

    private void expand() {
        int[] newArr = new int[arr.length * 2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < space; j++) {
                newArr[i * 2 * space + j] = arr[i * space + j];
            }
        }

        space *= 2;
        arr = newArr;
    }

    void push(int stackNum, int val) {
        if(idx[stackNum] >= space) { expand(); }

        int index = (stackNum * space) + idx[stackNum];
        arr[index] = val;
        idx[stackNum]++;
    }

    int pop(int stackNum) {
        idx[stackNum]--;
        int index = (stackNum * space) + idx[stackNum];
        int res = arr[index];
        return res;
    }
}
