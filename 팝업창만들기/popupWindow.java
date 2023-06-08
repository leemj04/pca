LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
// popup_layout이 팝업창으로 불러올 화면
View popupView = inflater.inflate(R.layout.popup_layout, null);

// ConstraintLayout 부분은 어떤 Layout인지 따라 달라짐, LinearLayout이면 LinearLayout.~~ 이런식
int width = ConstraintLayout.LayoutParams.MATCH_PARENT;
int height = ConstraintLayout.LayoutParams.MATCH_PARENT;
//팝업창 바깥을 클릭했을 때 팝업 종료하기 기능, false면 꺼짐
boolean focusable = true; 
final PopupWindow popupWindow = new PopupWindow(popupView,width, height, focusable);

// AnyViewLayout은 현재 메인 Layout에 있는 View중 아무거나 가져오면 됨, 토큰용
popupWindow.showAtLocation(AnyViewinLayout, Gravity.CENTER, 0, 0);

Button btn = (Button) popupView.findViewById(R.id.close_btn);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        popupWindow.dismiss(); // 팝업창 닫는 함수
    }
});
