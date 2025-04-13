package com.example.demo.services;

import java.util.List;

import com.example.demo.models.BlocModel;

public interface BlocServices {
    List<BlocModel> retrieveAllBlocs();
    BlocModel addBloc(BlocModel b);
    BlocModel updateBloc(BlocModel b);
    BlocModel retrieveBloc(long idBloc);
    void removeBloc(long idBloc);
}
