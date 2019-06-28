package com.lizs.pattern.wrapper;

import com.lizs.pattern.adapter.ResultMsg;

public interface ILoginService {
    public ResultMsg login(String username, String password);

    public ResultMsg register(String username, String password);
}
