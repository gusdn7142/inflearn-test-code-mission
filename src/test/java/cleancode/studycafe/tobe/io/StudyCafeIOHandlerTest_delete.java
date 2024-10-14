package cleancode.studycafe.tobe.io;

import cleancode.studycafe.tobe.model.pass.StudyCafePassType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.assertj.core.api.Assertions.assertThat;

class StudyCafeIOHandlerTest_delete {

    StudyCafeIOHandler studyCafeIOHandler = new StudyCafeIOHandler();

    @DisplayName("이용권 선택 메시지 출력 및 이용권(1,2,3)의 종류를 입력받아 따라 시간/주간/고정석 단위 상수 반환")
    @Test
    public void askPassTypeSelecting() {
        // given
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); // System.in을 입력 스트림으로 리다이렉트합니다.

        // when
        StudyCafePassType studyCafePassType = studyCafeIOHandler.askPassTypeSelecting();

        // then
        assertThat(studyCafePassType).isEqualTo(StudyCafePassType.HOURLY);
    }




    @Test
    void askPassSelecting() {


    }

    @Test
    void askLockerPass() {


    }


}
