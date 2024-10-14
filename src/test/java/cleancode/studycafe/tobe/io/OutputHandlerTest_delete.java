package cleancode.studycafe.tobe.io;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OutputHandlerTest_delete {

    OutputHandler outputHandler = new OutputHandler();

//    @DisplayName("특정 이용권(1:시간단위,2:주단위,3:고정)에 해당되는 이용권 목록 출력")
//    @Test
//    void showPassListForSelection() {
//
//        //given
//        List<StudyCafeSeatPass> passCandidates = new ArrayList<>() {{
//            add(StudyCafeSeatPass.of(StudyCafePassType.HOURLY, 2, 4000, 0.0));   // 2시간 이용권, 4000원, 할인 없음
//            add(StudyCafeSeatPass.of(StudyCafePassType.HOURLY, 4, 6500, 0.0));   // 4시간 이용권, 6500원, 할인 없음
//            add(StudyCafeSeatPass.of(StudyCafePassType.HOURLY, 6, 9000, 0.0));   // 6시간 이용권, 9000원, 할인 없음
//            add(StudyCafeSeatPass.of(StudyCafePassType.HOURLY, 8, 11000, 0.0));  // 8시간 이용권, 11000원, 할인 없음
//            add(StudyCafeSeatPass.of(StudyCafePassType.HOURLY, 10, 12000, 0.0)); // 10시간 이용권, 12000원, 할인 없음
//            add(StudyCafeSeatPass.of(StudyCafePassType.HOURLY, 12, 13000, 0.0)); // 12시간 이용권, 13000원, 할인 없음
//        }};
//
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        PrintStream originalOut = System.out;  // 원래 System.out을 저장
//        System.setOut(new PrintStream(outputStream));  // System.out을 캡처할 스트림으로 변경
//
//
//        //when
//        outputHandler.showPassListForSelection(passCandidates);
//
//        // Then
//        String expectedOutput = "\n" +
//            "이용권 목록\n" +
//            "1. 2시간권 - 4000원\n" +
//            "2. 4시간권 - 6500원\n" +
//            "3. 6시간권 - 9000원\n" +
//            "4. 8시간권 - 11000원\n" +
//            "5. 10시간권 - 12000원\n" +
//            "6. 12시간권 - 13000원\n";
//
//        assertThat(outputStream.toString()).isEqualTo(expectedOutput);
//
//        // System.out을 원래 상태로 복원
//        System.setOut(originalOut);
//
//    }

//    @DisplayName("사물함 사용 여부 체크 출력메시지")
//    @Test
//    void askLockerPass() {
//        // given
//        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(StudyCafePassType.FIXED, 4, 10000);
//
//       // when
//        outputHandler.askLockerPass(lockerPass);
//
//        // then
//        String expectedOutput = String.format(
//            "\n사물함을 이용하시겠습니까? (%s주권 - %d원)\n1. 예 | 2. 아니오",
//            lockerPass.getDuration(), lockerPass.getPrice()
//        );
//
//        assertThat(expectedOutput).isEqualTo(expectedOutput);
//
//        // restore original System.out
//        //System.setOut(System.out);
//    }


}
