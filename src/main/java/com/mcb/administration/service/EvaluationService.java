package com.mcb.administration.service;

import com.mcb.administration.dao.EvaluationRepository;
import com.mcb.administration.dto.EvaluationValueObject;
import com.mcb.administration.model.Evaluation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.util.Map;
import java.util.UUID;

@Service
public class EvaluationService {

    EvaluationRepository repository;

    public EvaluationService(EvaluationRepository repository) {
        this.repository = repository;
    }

    public Evaluation createAssets(EvaluationValueObject object) {

        Evaluation evaluation = new Evaluation();
        BeanUtils.copyProperties(object, evaluation);

        evaluation.setId(UUID.randomUUID()
                .toString()
                .replace("-", ""));
        evaluation = repository.save(evaluation);
        return evaluation;
    }


//    private String uuid() throws Exception{
//        MessageDigest salt = MessageDigest.getInstance("SHA-256");
//        salt.update(UUID.randomUUID().toString().getBytes("UTF-8"));
//        String digest = hex(salt.digest());
//    }
//
//    public static String hex(byte[] bytes) {
//        char[] result = Hex.encodeHex(bytes);
//        return new String(result);
//    }
}
