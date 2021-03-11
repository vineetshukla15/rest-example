package com.example.restexample;

public interface ICallbackHolder<T> {
	
	public IModel onSuccess(IModel json);
	public IModel onError();
	
}
