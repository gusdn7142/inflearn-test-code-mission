package cleancode.studycafe.tobe.model.order;

import cleancode.studycafe.tobe.model.pass.StudyCafePassType;
import cleancode.studycafe.tobe.model.pass.StudyCafeSeatPass;
import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudyCafePassOrderTest {



    @DisplayName("이용권(ex, 시간/주/고정)과 사물함 선택에 따른 총 금액 계산 및 조회")
    @Test
    void getTotalPrice() {

        // given
        StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(StudyCafePassType.FIXED, 4, 250000, 0.1);
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(StudyCafePassType.FIXED, 4, 10000);
        StudyCafePassOrder studyCafePassOrder = StudyCafePassOrder.of(seatPass, lockerPass);

        // when
        int totalPrice = studyCafePassOrder.getTotalPrice();

        // then
        assertThat(totalPrice).isEqualTo((seatPass.getPrice() + lockerPass.getPrice()) - seatPass.getDiscountPrice());
    }
}
