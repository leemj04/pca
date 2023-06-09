/*
이 함수를 호출하면 가상키보드를 숨긴다.
부모 레이아웃에 id를 정해준 후 findViewbyId로 찾아서 setonclicklistener를 해주면 
배경을 클릭했을때 키보드를 숨기도록 할 수 있다.
*/

public static void hideSoftKeyboard(Activity activity) {
    InputMethodManager inputMethodManager =
           (InputMethodManager) activity.getSystemService(
                   Activity.INPUT_METHOD_SERVICE);
    if(inputMethodManager.isAcceptingText()){
        inputMethodManager.hideSoftInputFromWindow(
                activity.getCurrentFocus().getWindowToken(),
                0
        );
    }
}
