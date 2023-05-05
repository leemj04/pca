public class Adapter_class extends RecyclerView.Adapter<Adapter_class.ViewHolder> { // adapter 이름 정해주세요

    private ArrayList<item_class> item_list_name; // item_class 다른 파일로 만들어 둘것(맨 아래에 예시), item_list_name은 변수명

    @NonNull
    @Override
    public Adapter_class.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_id, parent, false); // recyclerview의 id
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_class.ViewHolder holder, int position) {
        holder.onBind(item_list_name.get(position));
    }

    public void setList(ArrayList<item_class> list){
        this.item_list_name = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return item_list_name.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView view; // 예시, textView, editView, ImageView 등등을 써야 할때 이 자리에

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            view = itemView.findViewById(R.id.view_id);
        }

        void onBind(item_class item){
            view.setText(item.name); // 어디까지나 이렇게 하라는 예시임
        }
    }
}

//---------------------------item_class 의 예시-----------------------
public class item_class {
    String name;
    String message;
    int resourceId;

    public item_class(int resourceId, String name, String message) { // 초깃값 
        this.name = name;
        this.message= message;
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
