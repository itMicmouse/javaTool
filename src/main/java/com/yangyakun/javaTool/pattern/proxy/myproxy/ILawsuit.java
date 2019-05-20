package com.yangyakun.javaTool.pattern.proxy.myproxy;

public interface ILawsuit {
    /**
     * 提交申请
     */
    void submit() throws Exception;

    /**
     * 进行举证
     */
    void burden() throws Exception;

    /**
     * 开始辩护
     */
    void defend() throws Exception;

    /**
     * 诉讼完成
     */
    void finish() throws Exception ;
}
