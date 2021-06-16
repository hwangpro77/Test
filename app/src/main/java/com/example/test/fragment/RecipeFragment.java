package com.example.test.fragment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ListFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.ListViewItem;
import com.example.test.R;
import com.example.test.activity.testSearch;
import com.example.test.adapter.ListViewAdapter;

public class RecipeFragment extends ListFragment {

    Button testSearch; //프로필 버튼

    ListViewAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        // inflater.inflate(R.layout.fragment_recipe, container, false);
        // Adapter 생성 및 Adapter 지정.
//        View view = inflater.inflate(R.layout.listview_item, container, false);
//        testSearch = view.findViewById(R.id.testSearch);
//        testSearch.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("ddd", "click");
//                Intent intent = new Intent(getActivity(), testSearch.class);
//                startActivity(intent);
//            }
//        });
//        testSearch.setOnClickListener(onClickListener);

        adapter = new ListViewAdapter();
        setListAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.alrio),
                "알리오올리오");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.chicken),
                "치킨");
//        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.daegae),
//                "대게");
//        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.dimsum),
//                "딤섬");
//        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.galbitang),
//                "갈비탕");
//        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.nangmon),
//                "냉면");
//        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.salad),
//                "샐러드");
//        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.skiyaki),
//                "스키야키");
//        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ubock),
//                "어복쟁반");
        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "하늘에 계신 우리 아버지");
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "아버지의 이름을 거룩하게 하시며");
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "아버지의 나라가 오게 하시며");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "아버지의 뜻이 하늘에서와 같이");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "땅에서도 이루어지게 하소서");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "오늘 우리에게 일용할 양식을 주시고");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "우리가 우리에게 잘못한 사람을");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "용서하여 준 것 같이");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "우리 죄를 용서하여 주시고");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "우리를 시험에 빠지게 않게 하시고");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "악에서 구하소서");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "내가 죽음의 계곡을 걸어가도");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "두려워하지 않는 것은");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "주께서 나와 함께 하심이라");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "도와주세요!");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "누군가 저를 자꾸");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "쫓아오고 있어요");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "저는 김숙자 입니다.");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "너무 추운날 밖에 나왔는데");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "혹시 오늘이 여름인가요?");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "안녕하세요?");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "저좀 도와주세요!!");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.smile),
                "저 사람이 저를 자꾸 쫓아와요");



        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // get TextView's Text.
        ListViewItem item = (ListViewItem) l.getItemAtPosition(position);

        String titleStr = item.getTitle();
        // String descStr = item.getDesc() ;
        Drawable iconDrawable = item.getIcon();

        Log.d("ddd", "click");

        // TODO : use item data.
    }

//    View.OnClickListener onClickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            switch (v.getId()) {
//                case R.id.profileButton:
//                    //프로필 이동
//                    Intent intent = new Intent(getActivity(), com.example.test.activity.testSearch.class);
//                    startActivity(intent);
//            }
//        }
//    };

    public void addItem(Drawable icon, String title) {
        adapter.addItem(icon, title);
    }

}


