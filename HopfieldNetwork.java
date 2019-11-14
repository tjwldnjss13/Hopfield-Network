public class HopfieldNetwork {
    public static double[] ZERO_SAMPLE = {0,0,1,1,1,1,1,1,0,0,
                                          0,1,1,1,1,1,1,1,1,0,
                                          1,1,0,0,0,0,0,0,1,1,
                                          1,1,0,0,0,0,0,0,1,1,
                                          1,1,0,0,0,0,0,0,1,1,
                                          1,1,0,0,0,0,0,0,1,1,
                                          1,1,0,0,0,0,0,0,1,1,
                                          1,1,0,0,0,0,0,0,1,1,
                                          0,1,1,1,1,1,1,1,1,0,
                                          0,0,1,1,1,1,1,1,0,0};
    public static double[] ONE_SAMPLE = {0,0,0,0,1,1,0,0,0,0,
                                         0,0,0,1,1,1,0,0,0,0,
                                         0,0,1,1,1,1,0,0,0,0,
                                         0,0,0,0,1,1,0,0,0,0,
                                         0,0,0,0,1,1,0,0,0,0,
                                         0,0,0,0,1,1,0,0,0,0,
                                         0,0,0,0,1,1,0,0,0,0,
                                         0,0,0,0,1,1,0,0,0,0,
                                         0,0,1,1,1,1,1,1,0,0,
                                         0,0,1,1,1,1,1,1,0,0};
    public static double[] TWO_SAMPLE  = {0,0,1,1,1,1,1,1,0,0,
                                          0,1,1,1,1,1,1,1,1,0,
                                          1,1,1,0,0,0,0,1,1,1,
                                          1,1,0,0,0,0,0,1,1,1,
                                          0,0,0,0,0,0,1,1,1,0,
                                          0,0,0,0,1,1,1,1,0,0,
                                          0,0,1,1,1,1,0,0,0,0,
                                          0,1,1,1,0,0,0,0,0,0,
                                          1,1,1,1,1,1,1,1,1,1,
                                          1,1,1,1,1,1,1,1,1,1};
    public static double[] THREE_SAMPLE = {0,0,1,1,1,1,1,1,0,0,
                                          0,1,1,1,1,1,1,1,1,0,
                                          1,1,1,0,0,0,0,1,1,1,
                                          1,1,0,0,0,0,0,1,1,1,
                                          0,0,0,0,1,1,1,1,1,0,
                                          0,0,0,0,1,1,1,1,1,0,
                                          1,1,0,0,0,0,0,1,1,1,
                                          1,1,1,0,0,0,0,1,1,1,
                                          0,1,1,1,1,1,1,1,1,0,
                                          0,0,1,1,1,1,1,1,0,0};
    public static double[] FOUR_SAMPLE = {0,0,0,0,1,1,1,0,0,0,
                                          0,0,0,1,1,1,1,0,0,0,
                                          0,0,1,1,1,1,1,0,0,0,
                                          0,1,1,1,0,1,1,0,0,0,
                                          1,1,1,0,0,1,1,0,0,0,
                                          1,1,1,1,1,1,1,1,1,1,
                                          1,1,1,1,1,1,1,1,1,1,
                                          0,0,0,0,0,1,1,0,0,0,
                                          0,0,0,0,0,1,1,0,0,0,
                                          0,0,0,0,0,1,1,0,0,0};
    public static double[] FIVE_SAMPLE = {1,1,1,1,1,1,1,1,1,1,
                                          1,1,1,1,1,1,1,1,1,1,
                                          1,1,0,0,0,0,0,0,0,0,
                                          1,1,0,0,0,0,0,0,0,0,
                                          1,1,1,1,1,1,1,1,1,0,
                                          1,1,1,1,1,1,1,1,1,1,
                                          0,0,0,0,0,0,0,0,1,1,
                                          1,1,0,0,0,0,0,0,1,1,
                                          1,1,1,1,1,1,1,1,1,1,
                                          0,1,1,1,1,1,1,1,1,0};
    public static double[] SIX_SAMPLE = {0,0,1,1,1,1,1,1,0,0,
                                         0,1,1,1,1,1,1,1,1,0,
                                         1,1,1,0,0,0,0,1,1,1,
                                         1,1,0,0,0,0,0,0,1,1,
                                         1,1,0,1,1,1,1,0,0,0,
                                         1,1,1,1,1,1,1,1,1,0,
                                         1,1,0,0,0,0,0,0,1,1,
                                         1,1,0,0,0,0,0,0,1,1,
                                         0,1,1,1,1,1,1,1,1,0,
                                         0,0,1,1,1,1,1,1,0,0};
    public static double[] SEVEN_SAMPLE = {1,1,1,1,1,1,1,1,1,1,
                                           1,1,1,1,1,1,1,1,1,1,
                                           0,0,0,0,0,0,0,0,1,1,
                                           0,0,0,0,0,0,0,1,1,0,
                                           0,0,0,0,0,0,1,1,0,0,
                                           0,0,0,0,0,1,1,0,0,0,
                                           0,0,0,0,1,1,0,0,0,0,
                                           0,0,0,0,1,1,0,0,0,0,
                                           0,0,0,0,1,1,0,0,0,0,
                                           0,0,0,0,1,1,0,0,0,0};
    public static double[] EIGHT_SAMPLE = {0,0,1,1,1,1,1,1,0,0,
                                           0,1,1,1,1,1,1,1,1,0,
                                           1,1,0,0,0,0,0,0,1,1,
                                           1,1,0,0,0,0,0,0,1,1,
                                           0,1,1,1,1,1,1,1,1,0,
                                           0,1,1,1,1,1,1,1,1,0,
                                           1,1,0,0,0,0,0,0,1,1,
                                           1,1,0,0,0,0,0,0,1,1,
                                           0,1,1,1,1,1,1,1,1,0,
                                           0,0,1,1,1,1,1,1,0,0};
    public static double[] NINE_SAMPLE = {0,0,1,1,1,1,1,1,0,0,
                                          0,1,1,1,1,1,1,1,1,0,
                                          1,1,0,0,0,0,0,0,1,1,
                                          1,1,0,0,0,0,0,0,1,1,
                                          1,1,1,1,1,1,1,1,1,1,
                                          0,1,1,1,1,1,1,1,1,1,
                                          0,0,0,0,0,0,0,0,1,1,
                                          1,1,0,0,0,0,0,0,1,1,
                                          1,1,1,1,1,1,1,1,1,0,
                                          0,1,1,1,1,1,1,1,1,0};

    
    double[] input =
    {0,0,0,0,1,1,0,0,0,0,
        0,0,0,1,1,1,0,0,0,0,
        0,0,1,1,1,1,0,0,0,0,
        0,0,0,0,1,1,0,0,0,0,
        0,0,0,0,1,1,0,0,0,0,
        0,0,0,0,1,1,0,0,0,0,
        0,0,0,0,1,1,0,0,0,0,
        0,0,0,0,1,1,0,0,0,0,
        0,0,1,1,1,1,1,1,0,0,
        0,0,1,1,1,1,1,1,0,0};

    double[][] weight = new double[100][100];
    double[] thresh = new double[100];
    int changed = -1;
    int match = -1;


    public static void main(String[] args) {
        HopfieldNetwork hn = new HopfieldNetwork();
        int iteration = 1;

        hn.setWeight();

        hn.initThresh();
        hn.setThresh();

        hn.printInput();
        hn.matchInput();

        while (hn.changed != 0) {
            System.out.println("-----Input 보정-----");
            hn.changed = 0;

            System.out.println("[" + iteration + "]");

            hn.setNET();
            hn.printInput();
            hn.matchInput();
            System.out.println("Input vector 100개 중 " + hn.changed + "개 보정 필요");

            iteration++;
        }

        System.out.println("-----보정 완료-----");
    }

    void initThresh() {
        for (int i=0; i<100; i++) 
            this.thresh[i] = 0;
    }

    void setWeight() {
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                if (i == j)
                    this.weight[i][j] = 0;
                else {
                    this.weight[i][j] = ((2 * ZERO_SAMPLE[i]) - 1) * ((2 * ZERO_SAMPLE[j]) - 1) +
                                        ((2 * ONE_SAMPLE[i]) - 1) * ((2 * ONE_SAMPLE[j]) - 1) +
                                        ((2 * TWO_SAMPLE[i]) - 1) * ((2 * TWO_SAMPLE[j]) - 1) +
                                        ((2 * THREE_SAMPLE[i]) - 1) * ((2 * THREE_SAMPLE[j]) - 1) +
                                        ((2 * FOUR_SAMPLE[i]) - 1) * ((2 * FOUR_SAMPLE[j]) - 1) +
                                        ((2 * FIVE_SAMPLE[i]) - 1) * ((2 * FIVE_SAMPLE[j]) - 1) +
                                        ((2 * SIX_SAMPLE[i]) - 1) * ((2 * SIX_SAMPLE[j]) - 1) +
                                        ((2 * SEVEN_SAMPLE[i]) - 1) * ((2 * SEVEN_SAMPLE[j]) - 1) +
                                        ((2 * EIGHT_SAMPLE[i]) - 1) * ((2 * EIGHT_SAMPLE[j]) - 1) +
                                        ((2 * NINE_SAMPLE[i]) - 1) * ((2 * NINE_SAMPLE[j]) - 1);
                }
            }
        }
    }

    void setThresh() {
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) 
                this.thresh[i] += this.weight[i][j];
            this.thresh[i] = this.thresh[i] / (-2);
        }
    }

    void printThresh() {
        System.out.println("-----Thresh-----");
        System.out.print("<");
        for (int i=0; i<100; i++)
            System.out.print(this.thresh[i] + " ");
        System.out.println(">");
    }

    void setNET() {
        double temp;
        for (int i=99; i>=0; i--) {
            temp = 0;

            for (int j=0; j<100; j++) 
                temp += this.weight[i][j] * this.input[j];

            temp += this.thresh[i];

            if (temp > 0) {
                this.changed += 1 - this.input[i];
                this.input[i] = 1;
            }
            else if (temp < 0) {
                this.changed += this.input[i];
                this.input[i] = 0;
            }
            else if (temp == 0)
                continue;
        }
    }

    void printInput() {
        for (int i=0; i<100; i++) {
            if (this.input[i] == 1)
                System.out.print("O");
            else if (this.input[i] == 0)
                System.out.print(" ");

            if ((i+1) % 10 == 0)
                System.out.println();
        }
    }

    void matchInput() {
        matchInput_0();
        matchInput_1();
        matchInput_2();
        matchInput_3();
        matchInput_4();
        matchInput_5();
        matchInput_6();
        matchInput_7();
        matchInput_8();
        matchInput_9();

        if (this.match == 0)
            System.out.println("패턴 0에 수렴");
        else if (this.match == 1)
            System.out.println("패턴 1에 수렴");
        else if (this.match == 2)
            System.out.println("패턴 2에 수렴");
        else if (this.match == 3)
            System.out.println("패턴 3에 수렴");
        else if (this.match == 4)
            System.out.println("패턴 4에 수렴");
        else if (this.match == 5)
            System.out.println("패턴 5에 수렴");
        else if (this.match == 6)
            System.out.println("패턴 6에 수렴");
        else if (this.match == 7)
            System.out.println("패턴 7에 수렴");
        else if (this.match == 8)
            System.out.println("패턴 8에 수렴");
        else if (this.match == 9)
            System.out.println("패턴 9에 수렴");
        else {
            this.match = -1;
            System.out.println("어느 패턴에도 수렴하지 않음");
        }
    }

    void matchInput_0() {
        boolean doMatch = true;
        for (int i=0; i<100; i++) {
            if (this.input[i] != ZERO_SAMPLE[i]) {
                doMatch = false;
                break;
            }
        }
        if (doMatch)
            this.match = 0;
    }

    void matchInput_1() {
        boolean doMatch = true;
        for (int i=0; i<100; i++) {
            if (this.input[i] != ONE_SAMPLE[i]) {
                doMatch = false;
                break;
            }
        }
        if (doMatch)
            this.match = 1;
    }

    void matchInput_2() {
        boolean doMatch = true;
        for (int i=0; i<100; i++) {
            if (this.input[i] != TWO_SAMPLE[i]) {
                doMatch = false;
                break;
            }
        }
        if (doMatch)
            this.match = 2;
    }

    void matchInput_3() {
        boolean doMatch = true;
        for (int i=0; i<100; i++) {
            if (this.input[i] != THREE_SAMPLE[i]) {
                doMatch = false;
                break;
            }
        }
        if (doMatch)
            this.match = 3;
    }

    void matchInput_4() {
        boolean doMatch = true;
        for (int i=0; i<100; i++) {
            if (this.input[i] != FOUR_SAMPLE[i]) {
                doMatch = false;
                break;
            }
        }
        if (doMatch)
            this.match = 4;
    }

    void matchInput_5() {
        boolean doMatch = true;
        for (int i=0; i<100; i++) {
            if (this.input[i] != FIVE_SAMPLE[i]) {
                doMatch = false;
                break;
            }
        }
        if (doMatch)
            this.match = 5;
    }

    void matchInput_6() {
        boolean doMatch = true;
        for (int i=0; i<100; i++) {
            if (this.input[i] != SIX_SAMPLE[i]) {
                doMatch = false;
                break;
            }
        }
        if (doMatch)
            this.match = 6;
    }

    void matchInput_7() {
        boolean doMatch = true;
        for (int i=0; i<100; i++) {
            if (this.input[i] != SEVEN_SAMPLE[i]) {
                doMatch = false;
                break;
            }
        }
        if (doMatch)
            this.match = 7;
    }

    void matchInput_8() {
        boolean doMatch = true;
        for (int i=0; i<100; i++) {
            if (this.input[i] != EIGHT_SAMPLE[i]) {
                doMatch = false;
                break;
            }
        }
        if (doMatch)
            this.match = 8;
    }

    void matchInput_9() {
        boolean doMatch = true;
        for (int i=0; i<100; i++) {
            if (this.input[i] != NINE_SAMPLE[i]) {
                doMatch = false;
                break;
            }
        }
        if (doMatch)
            this.match = 9;
    }
}