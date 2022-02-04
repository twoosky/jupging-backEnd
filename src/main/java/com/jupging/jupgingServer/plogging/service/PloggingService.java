package com.jupging.jupgingServer.plogging.service;

import com.jupging.jupgingServer.plogging.domain.Plogging;
import com.jupging.jupgingServer.plogging.dto.PostPloggingReq;
import com.jupging.jupgingServer.plogging.dto.PostPloggingRes;
import com.jupging.jupgingServer.user.domain.User;

public interface PloggingService {

    public PostPloggingRes savePlogging(User user, PostPloggingReq postPloggingReq) throws Exception;
    public Plogging createPlogging(User runner, String routeImage, String trashImage, PostPloggingReq postPloggingReq) throws Exception;
}