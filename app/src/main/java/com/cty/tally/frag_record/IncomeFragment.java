package com.cty.tally.frag_record;
import com.cty.tally.R;
import com.cty.tally.db.DBManager;
import com.cty.tally.db.TypeBean;
import java.util.List;
/**
 * 收入记录页面
 */
public class IncomeFragment extends BaseRecordFragment {


    @Override
    public void loadDataToGV() {
        super.loadDataToGV();
        //获取数据库当中的数据源
        List<TypeBean> inlist = DBManager.getTypeList(1);
        typeList.addAll(inlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("其他");
        typeIv.setImageResource(R.mipmap.in_qt_fs);
    }

    @Override
    public void saveAccountToDB() {
        if(accountBean.getsImageId() == R.mipmap.ic_qita_fs){
            accountBean.setsImageId(R.mipmap.in_qt_fs);
        }
        accountBean.setKind(1);
        DBManager.insertItemToAccounttb(accountBean);
    }
}
