package com.ocr.view;

public interface MyObservable {
	public void addObserver(MyObserver obs);
	public void updateObserver();
	public void delObserver();
}
