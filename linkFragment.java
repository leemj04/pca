// Fragment를 불러오고 싶은 곳에 이 코드를 넣으세요
FragmentManager fragmentManager = getFragmentManager();
FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); // fragment Manager는 하나만 있어도 됨

fragmentTransaction.replace(R.id.container, new fragment_class()); 
// container는 fragment를 집어넣을 layout id
// frament_class은 불러올 fragment의 class 이름

fragmentTransaction.commit();
