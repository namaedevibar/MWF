package com.activity.devibar.mwf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;


import com.activity.devibar.mwf.model.WorkOrder;


public class WorkOrderActivity extends AppCompatActivity {

    private TextView mWorkOrderNumber;
    private TextView mDateTime;
    private TextView mHeadingTime;
    private TextView mDeadline;

    private TextView mWorkOrderType;
    private TextView mAccountNumber;
    private TextView mKwh;
    private TextView mAddress;
    private TextView mDescription;
    private TextView mSpecialInstructions;

    private TextView mAssignedTo;
    private TextView mSupervisor;
    private TextView mExpDate;
    private TextView mExpTime;
    private TextView mCurrentStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_order);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mWorkOrderNumber = (TextView) findViewById(R.id.txtWorkOrderName);
        mDateTime = (TextView) findViewById(R.id.txtDate);
        mDeadline = (TextView) findViewById(R.id.txtDeadline);

        mWorkOrderType = (TextView) findViewById(R.id.txtWorkOrderType);
        mAccountNumber = (TextView) findViewById(R.id.txtAccountNumber);
       mKwh = (TextView) findViewById(R.id.txtkWh);
         mAddress = (TextView) findViewById(R.id.txtAddress);
        mDescription = (TextView) findViewById(R.id.txtAddress);
       mSpecialInstructions = (TextView) findViewById(R.id.txtSpecInstruct);

        mAssignedTo = (TextView) findViewById(R.id.txtAssignedTo);
        mSupervisor = (TextView) findViewById(R.id.txtSupervisor);
        mExpDate = (TextView) findViewById(R.id.txtExpDate);
        mExpTime = (TextView) findViewById(R.id.txtExpTime);
        mCurrentStatus= (TextView) findViewById(R.id.txtStatus);

        WorkOrder workorder = new WorkOrder("5/30/2016  11:23:45 AM","N/A","#201605300002", "Electric Service Installation",
                                    "N/A", "N/A", "N/A", "99-0001-0011", "Trinidad, Samuel Grey",
                                    "Ongoing-Overdue", "77 Airport Rd. Hangar - Airport Ormoc City Leyte",
                                    "","Trinidad, Samuel Grey", "N/A", "N/A", "N/A", "N/A", "N/A",
                                    "Ormoc City, Leyte", "6/1/2016", "11:23:45");


       mWorkOrderNumber.setText(workorder.getWorkOrderNo());
        mDateTime.setText(workorder.getDateTimeIN());
        mDeadline.setText("10 Hrs. Remaining");

        mWorkOrderType.setText(workorder.getWorkOrderType());
      mAccountNumber.setText(workorder.getAccountID());
        mKwh.setText("N/A");
        mAddress.setText(workorder.getAddress());
         mDescription.setText(workorder.getNotes1());
        mSpecialInstructions.setText(workorder.getNotes2());

         mAssignedTo.setText("N/A");
         mSupervisor.setText(workorder.getSupervisor());
       mExpDate.setText(workorder.getDUEDATE());
        mExpTime.setText(workorder.getExecutionTime());
        mCurrentStatus.setText(workorder.getWorkOrderStatus());



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.workorder_menu,menu);
        return super.onCreateOptionsMenu(menu);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.bookmark_menu: break;
            case R.id.direction_menu: break;
            case R.id.home: break;

        }

        return super.onOptionsItemSelected(item);
    }
}
