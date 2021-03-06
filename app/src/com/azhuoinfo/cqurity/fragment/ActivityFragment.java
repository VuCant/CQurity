package com.azhuoinfo.cqurity.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.azhuoinfo.cqurity.AccountVerify;
import com.azhuoinfo.cqurity.R;

import mobi.cangol.mobile.base.BaseContentFragment;
import mobi.cangol.mobile.base.FragmentInfo;

public class ActivityFragment extends BaseContentFragment {
	private AccountVerify mAccountVerify;
	private ImageView mPoll,mRequest,mUpPro,mAdvice;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mAccountVerify = AccountVerify.getInstance(getActivity());
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View v = inflater.inflate(R.layout.fragment_home_activity, container, false);
		return v;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		findViews(view);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		initViews(savedInstanceState);
		initData(savedInstanceState);
	}

	@Override
	protected void findViews(View view) {

		mPoll = (ImageView) view.findViewById(R.id.imageview_poll);
		mRequest = (ImageView) view.findViewById(R.id.imageview_request);
		mUpPro = (ImageView) view.findViewById(R.id.imageview_update_project);
		mAdvice = (ImageView) view.findViewById(R.id.imageview_advice);
	}
	
	@Override
	protected void initViews(Bundle savedInstanceState) {
		this.setTitle("Activity");

		/**
		 * 对于poll的事件监听
		 */
		mPoll.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				replaceFragment(PollFragment.class,"PollFragment",null);
			}
		});
	}

	@Override
	protected void initData(Bundle savedInstanceState) {
		
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}

	@Override
	protected FragmentInfo getNavigtionUpToFragment() {
		return null;
	}
	


	@Override
	public boolean isCleanStack() {
		return true;
	}

}
