package com.azhuoinfo.cqurity.api.task;

public abstract class BaseTask {
	public abstract void onStart();
	public abstract void onProcess();
	public abstract void onSuccess();
	public abstract void onFailure();
}
