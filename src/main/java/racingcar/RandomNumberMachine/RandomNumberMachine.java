package racingcar.RandomNumberMachine;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberMachine {

    public static int createRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
