/*
 * Password Management API
 * API для управления паролями, включает операции CRUD
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.PasswordRequest;
import org.openapitools.client.model.PasswordResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PasswordsApi
 */
@Disabled
public class PasswordsApiTest {

    private final PasswordsApi api = new PasswordsApi();

    /**
     * Создать новый пароль
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPasswordTest() throws ApiException {
        PasswordRequest passwordRequest = null;
        PasswordResponse response = api.createPassword(passwordRequest);
        // TODO: test validations
    }

    /**
     * Удалить пароль по ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePasswordTest() throws ApiException {
        Integer id = null;
        api.deletePassword(id);
        // TODO: test validations
    }

    /**
     * Получить один пароль по ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPasswordTest() throws ApiException {
        Integer id = null;
        PasswordResponse response = api.getPassword(id);
        // TODO: test validations
    }

    /**
     * Получить список всех паролей
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPasswordsTest() throws ApiException {
        List<PasswordResponse> response = api.listPasswords();
        // TODO: test validations
    }

    /**
     * Обновить пароль по ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePasswordTest() throws ApiException {
        Integer id = null;
        PasswordRequest passwordRequest = null;
        PasswordResponse response = api.updatePassword(id, passwordRequest);
        // TODO: test validations
    }

}
