package cleancode.studycafe.tobe.model.pass;

import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudyCafeSeatPassTest {

    @DisplayName("시간단위 이용권 객체 생성")
    @Test
    void StudyCafeSeatPass() {
        // given
        StudyCafePassType passType = StudyCafePassType.HOURLY;
        int duration = 2;
        int price = 4000;
        double discountRate = 0.0;

        // when
        StudyCafeSeatPass pass = StudyCafeSeatPass.of(passType, duration, price, discountRate);

        // then
        assertThat(pass).isNotNull();
        assertThat(pass.getPassType()).isEqualTo(passType);
        assertThat(pass.getDuration()).isEqualTo(duration);
        assertThat(pass.getPrice()).isEqualTo(price);
        assertThat(pass.getDiscountPrice()).isEqualTo((int)(price*discountRate));
    }

    @DisplayName("사물함을 이용할 수 있는 고정권 이용권이 맞는지 확인")
    @Test
    void isSameDurationType() {
        // given
        StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(StudyCafePassType.FIXED, 4, 250000, 0.1);
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(StudyCafePassType.FIXED, 4, 10000);

        // when
        boolean result = seatPass.isSameDurationType(lockerPass);

        // then
        assertThat(result).isTrue();
    }

    @DisplayName("이용권(ex, 시간/주/고정)이 동일한지 확인")
    @Test
    void isSamePassType() {
        // given
        StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(StudyCafePassType.FIXED, 4, 250000, 0.1);

        // when
        boolean result = seatPass.isSamePassType(StudyCafePassType.FIXED);

        // then
        assertThat(result).isTrue();
    }


}
