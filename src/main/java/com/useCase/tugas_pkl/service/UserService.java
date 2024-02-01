package com.useCase.tugas_pkl.service;

import com.useCase.tugas_pkl.dto.user.UserConfigViewDTO;

import java.util.List;

public interface UserService {

    public List<UserConfigViewDTO> showAllUser();

}
