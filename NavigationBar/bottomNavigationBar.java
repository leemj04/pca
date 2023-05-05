public class MainActivity extends AppCompatActivity { // 이 액티비티는 그냥 배경이라고 생각하면 됨

    private fragment_class1 fragment_name1 = new fragment_class1(); // fragment_class1은 클래스 이름, fragment_name1은 변수명
    private fragment_class1 fragment_name2 = new fragment_class2();
    private fragment_class1 fragment_name3 = new fragment_class3();
    FragmentManager fragmentManager = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, fragment_name1).commit();
        // frame_layout은 fragment를 그릴 틀(크기,위치)
        // fragment_name1은 처음 보이는 fragment

        BottomNavigationView bottom_navigation_name = findViewById(R.id.bottom_navigation_id); // bottomNavigationView id
        bottom_navigation_name.setOnItemSelectedListener(new ItemSelectedListener());

    }

    class ItemSelectedListener implements NavigationBarView.OnItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (menuItem.getItemId()) {
                case R.id.menu1_id: // 첫번째 menu id
                    transaction.replace(R.id.frame_layout, fragment_name1).commit();
                    break;
                case R.id.menu2_id: // 두번째 menu id
                    transaction.replace(R.id.frame_layout, fragment_name2).commit();
                    break;
                case R.id.menu3_id: // 세번째 menu id
                    transaction.replace(R.id.frame_layout, fragment_name3).commit();
                    break;

            }

            return true;
        }
    }
}
