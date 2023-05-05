//----------------------recyclerViewAdapter를 먼저 만들고 올것--------------------
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview_name;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview_name = (RecyclerView) findViewById(R.id.recyclerview_id);
        Adapter_class adapter_name = new Adapter_class();
      
        recyclerview_name.setAdapter(adapter_name);
        recyclerview_name.setLayoutManager(new LinearLayoutManager(this));
        
        // 이제 이 recyclerview에 데이터를 추가하는 방법
        item_class item_list_name = new ArrayList<item_class>();
        for(int i=1;i<=10;i++){
            item_list_name.add(new item_class(data1,..));
        }
        adapter_name.setList(item_list_name);
    }
}
