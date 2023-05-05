// Fragment를 불러오고 싶은 곳에 이 코드를 넣으세요
FragmentManager fragmentManager = getFragmentManager();
FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

fragmentTransaction.replace(R.id.container, new fragment_name()); 
// container는 fragment를 집어넣을 layout id
// frament_name은 불러올 fragment의 이름
// param1, param2는 데이터를 넘겨줄 때 쓸 수 있다.

fragmentTransaction.commit();
