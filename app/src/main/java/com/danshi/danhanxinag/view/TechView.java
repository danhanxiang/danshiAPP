package com.danshi.danhanxinag.view;

import com.danshi.danhanxinag.model.GirlsEntity;

import java.util.List;

/**
 * Created by 20939 on 2016/11/23.
 */
public interface TechView extends MvpView {

    void refresh(List<GirlsEntity.ResultsBean> data);

    void loadMore(List<GirlsEntity.ResultsBean> data);
}
