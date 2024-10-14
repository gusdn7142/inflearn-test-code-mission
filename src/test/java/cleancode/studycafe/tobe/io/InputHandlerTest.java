package cleancode.studycafe.tobe.io;

import cleancode.studycafe.tobe.exception.AppException;
import cleancode.studycafe.tobe.model.pass.StudyCafePassType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;


class InputHandlerTest {

    @DisplayName("이용권(1,2,3)의 종류를 입력받아 따라 시간/주간/고정석 단위 상수 반환")
    @Test
    void getPassTypeSelectingUserAction() {
        //given
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        InputHandler inputHandler = new InputHandler();

        //when
        StudyCafePassType studyCafePassType = inputHandler.getPassTypeSelectingUserAction();

        //then
        assertThat(studyCafePassType).isEqualTo(StudyCafePassType.HOURLY);
    }

    @DisplayName("이용권(1,2,3) 밖의 숫자 입력")
    @Test
    void getPassTypeSelectingInvalidUserAction() {
        //given
        String simulatedInput = "4\n";
        InputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);
        InputHandler inputHandler = new InputHandler();

        //when
        Throwable exception = assertThrows(AppException.class, () -> {
            inputHandler.getPassTypeSelectingUserAction();
        });

        //then
        assertThat(exception.getMessage()).isEqualTo("잘못된 입력입니다.");
    }

    @DisplayName("사물함 이용 여부(1 or 2)를 입력받아 확인")
    @Test
    void getLockerSelection() {
        //given
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        InputHandler inputHandler = new InputHandler();

        //when
        boolean lockerUsage = inputHandler.getLockerSelection();

        //then
        assertThat(lockerUsage).isEqualTo(true);
    }


}
