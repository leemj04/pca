public class MainActivity extends AppCompatActivity {
    
    View btn_name; // 연결할 버튼 이름
    
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
