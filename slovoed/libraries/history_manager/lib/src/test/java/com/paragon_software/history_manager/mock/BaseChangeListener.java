package com.paragon_software.history_manager.mock;

public abstract class BaseChangeListener
{
  protected final int mMaxNumberOfCalls;

  protected int mNumberOfCalls;

  public int getNumberOfCalls()
  {
    return mNumberOfCalls;
  }

  public BaseChangeListener(int maxNumberOfCalls)
  {
    mMaxNumberOfCalls = maxNumberOfCalls;
  }
}