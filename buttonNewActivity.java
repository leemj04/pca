public class MainActivity extends AppCompatActivity {
    
    View btn_name; // 연결할 버튼 변수명
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
        btn_name = findViewById(R.id.btn_id); // 연결할 버튼 아이디
        btn_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(this, new_activity_name.class); // 연결할 새로운 액티비티 이름
                startActivity(intent);
            }
        });
    }
}

//---------------------Fragment 일 경우--------------------------
public class MainFragment extends Fragment {
    //... 생략
    View btn_name; // 연결할 버튼 변수명
    
    public BlankFragment() {
        // Required empty public constructor
    }

    // ... 생략
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View temp = inflater.inflate(R.layout.fragment_name, container, false); // 현재 fragment의 이름, inflater는 하나만 있어도 됨
        
        btn_name = temp.findViewById(R.id.btn_id); // 연결할 버튼 아이디
        btn_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), new_activity_name.class); // 연결할 새로운 액티비티 이름
                startActivity(intent);
            }
        });
        return temp;
    }
}
