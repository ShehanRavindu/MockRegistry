package com.example.demo.controller;

import com.example.demo.dto.*;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.json.JSONArray;
//import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/idp/.well-known/openid-configuration")
public class IdpController {

    JSONArray test = null;

    @GetMapping
    public ResponseEntity<OpenIdConfigDto> getOpenIdConfigDto() {

        OpenIdConfigDto openIdConfigDto = new OpenIdConfigDto(
                "https://mockregistry.com.au:8443/idp",
                "https://mockregistry.com.au:8443/idp/.well-known/openid-configuration/jwks",
                "https://mockregistry.com.au:8443/idp/connect/token",
                Arrays.asList("sub"),
                Arrays.asList("PS256"),
                Arrays.asList("public"),
                Arrays.asList("cdr-register:bank:read"),
                Arrays.asList("token"),
                Arrays.asList("client_credentials"),
                Arrays.asList("private_key_jwt"),
                true,
                Arrays.asList("PS256")
        );

        return ResponseEntity.ok(openIdConfigDto);
    }

    @GetMapping("/jwks")
    public ResponseEntity<JwksDto> getJwks() {

        JwksDto jwksDto = new JwksDto(
                Arrays.asList(
                        new JwkDto (
                                "RSA",
                                "AQAB",
                                "sig",
                                "mockregisrtysigning",
//                                "PS256",
                                "nSBPmUSdo94zlhRtqqH7C444m8boxzdRSOORlFjrBdoGtWQytD8K3siOaZnao6OOP-EBddK3A8iFlSQ_-fV0Hv7HyToRnUiEcwNvWm3oLQT0uxtC9M0n-L5-B4ywI4CK_4Mm1A5wfiHGrclUOLa6Xf5ImggCOFrY6-amb3g9bCtcZzm5xPPtz6s0hFZzhURW4Y2rbdIN6AHlDu05S5_DepxStYYYi1fX4pclg9wAqQYI5xiLgtVPywr4Fo2RDOY_-bbrJUV63O7CKqe0WL9_UjYeTZ2ULblEQYj8K4hmKrZRIXdC9lxKfVZG_pBUj_VscN9rpLn_kP8PJINMcFcUhw",
                                Arrays.asList("MIIFSDCCAzACCQDpEn+7E76JBTANBgkqhkiG9w0BAQsFADBmMQswCQYDVQQGEwJTTDERMA8GA1UECAwIU291dGhlcm4xDjAMBgNVBAcMBUdhbGxlMQ0wCwYDVQQKDARXU08yMQswCQYDVQQLDAJPQjEYMBYGA1UEAwwPbW9ja3JlZ2lzdHJ5LmxrMB4XDTIxMDIwNzA4MjA1NVoXDTIyMDIwNzA4MjA1NVowZjELMAkGA1UEBhMCU0wxETAPBgNVBAgMCFNvdXRoZXJuMQ4wDAYDVQQHDAVHYWxsZTENMAsGA1UECgwEV1NPMjELMAkGA1UECwwCT0IxGDAWBgNVBAMMD21vY2tyZWdpc3RyeS5sazCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBALVxxr2YqVaQsPTeUMESkUx1glCjOOpy4MMsGePgBkcGsuMEFaUsxn+ATjd5aejccYOCBIwtbF8DxC3AL166JB979Ohr0jD9YrN7M/mmIML+ucP/uuyOx0fNNk5+buOdnBfXai06SxSLvpq6NCX7NPynj0Y/Ie3yRQd/CycQlPT2I1TWWLyZa07QC7CA8Bbg9LA3OJFapxSMLjjANzmbTWP73gBURNZmfOZbdOeUYo0DWUrD83R+o3uJTarwf3v48AcK3MIha5Rqbt6OF5wtcB7Bm+GpZFbHxgQfNV4e6Bsbjh4UCGSpS9JVBHG9DAkupzEOzqFIu2B5d3FU0lw5D28VnG2HeN9VJYuBA0xYlkHZuFi2aV8bytCnfOt2/QQEzNY4BUJoytZ1A+louuXogFrFhGJoNJTqVr2hkoIXZ4V2op7DF2QWYihR9NZcv/NpOUr6zUVTL0/UV1sOrsav9zsXdwMUPRHWGw59Mz2cxK6dngt7IUTJnJcqZR13pKRaRVZoCy2+5ONi78jDTZO4PdaQrjeFnAWmdJ5DYm60uehelPlRw2/+iODjSBup8gPxdTK3jvi4bhwB0cGQ74OD8NfjJIsxv0YNRPRJCQK/Ic1u3CjM+3t8wl9XtUupdDlPaFKGplnp7qcrj/yUHRWyQX7XUi36fllm23Hmn2E4Mlr3AgMBAAEwDQYJKoZIhvcNAQELBQADggIBAHXKs2x0ZFZ7urItLK6k0Q42OIT8b9qC4tG9ckekTt/HxFRhUqgTCGJUUL60Ke3FiK8XEG+BIx7beRtHqv1M933QM7qL3+dHUqFkQbL1e1G8B3/Km/cX/MPo7w/ngIPq+iX5wXUOKl27lhgI46BIWviD563/pX4oIrEubemJd48tHHVZNowpKv00CLEXtTCcBFFAm2lDbBYtE9XqEnwDviR96d4g7kcS/EwQmppVTM+2VbvhdWOD0+kxfskURHAPmMdiEEXsYC5wQMBhMeDshPondJ0cVn2a229KSYrF566CFLnu+4wkqFYuzgjNATo+xSJ+IpdB7wCrPYAKC6fAk1CcITyBxjnM09s3NXNTqdN6sQUANRi5lFhNKa9sDIwBpdnwrw2v0Gs1PxKNoauOKpQv9FKmvKZQKBYjSqy/AxO4nnP7Kd0zSe1Rc/W6kIkfDu/3aynvPxdBhP6OUGd7f1PIbMHG1V7s1lm2nezoj3E9/pEPyJr/5PGmx6iIO0lU1UKNqVfGK4/Jr8Q5VMhFqoYlM0pG/mEkskD0PmnNoRqulBgEvAcFTTQIMx8NGlsGNBsgkOV2t2z/fXmyjfnQq+MMsjTcfcXQ8s1spAUobFzGzfv4Xiws8tNxLgOSrsYzDZRlfZIIfjppU2XGaLrMF7BHL0472xIwwmcH7mHixJnk"),
                                "https://mockregistry.com.au:8443/idp/.well-known/openid-configuration/jwks"



                        )

                )
        );

        return ResponseEntity.ok(jwksDto);
    }

    @GetMapping("/sharable-account/{memberID}")
    public JSONObject getSharableAccounts() throws ParseException {
        String accountDetails = "{\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"account_id\": \"30080012343456\",\n" +
                "            \"display_name\": \"account_1\",\n" +
                "            \"accountId\": \"30080012343456\",\n" +
                "            \"accountName\": \"account_1\",\n" +
                "            \"authorizationMethod\": \"single\",\n" +
                "            \"nickName\": \"not-working\",\n" +
                "            \"customerAccountType\": \"Individual\",\n" +
                "            \"type\": \"TRANS_AND_SAVINGS_ACCOUNTS\",\n" +
                "            \"isEligible\": true,\n" +
                "            \"isJointAccount\": false,\n" +
                "            \"jointAccountConsentElectionStatus\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"account_id\": \"30080098763459\",\n" +
                "            \"display_name\": \"account_2\",\n" +
                "            \"accountId\": \"30080098763459\",\n" +
                "            \"accountName\": \"account_2\",\n" +
                "            \"authorizationMethod\": \"single\",\n" +
                "            \"nickName\": \"not-working\",\n" +
                "            \"customerAccountType\": \"Individual\",\n" +
                "            \"type\": \"TRANS_AND_SAVINGS_ACCOUNTS\",\n" +
                "            \"isEligible\": true,\n" +
                "            \"isJointAccount\": false,\n" +
                "            \"jointAccountConsentElectionStatus\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"account_id\": \"30080098971337\",\n" +
                "            \"display_name\": \"multi_auth_account\",\n" +
                "            \"accountId\": \"30080098971337\",\n" +
                "            \"accountName\": \"multi_auth_account\",\n" +
                "            \"authorizationMethod\": \"multiple\",\n" +
                "            \"nickName\": \"not-working\",\n" +
                "            \"customerAccountType\": \"Individual\",\n" +
                "            \"type\": \"TRANS_AND_SAVINGS_ACCOUNTS\",\n" +
                "            \"isEligible\": true,\n" +
                "            \"isJointAccount\": false,\n" +
                "            \"jointAccountConsentElectionStatus\": false,\n" +
                "            \"authorizationUsers\": [\n" +
                "                {\n" +
                "                    \"customer_id\": \"123\",\n" +
                "                    \"user_id\": \"psu1@wso2.com@carbon.super\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"customer_id\": \"456\",\n" +
                "                    \"user_id\": \"psu2@wso2.com@carbon.super\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"account_id\": \"650-000 N1232\",\n" +
                "            \"display_name\": \"Extra Account\",\n" +
                "            \"accountId\": \"650-000 N1232\",\n" +
                "            \"accountName\": \"Extra Account\",\n" +
                "            \"authorizationMethod\": \"single\",\n" +
                "            \"nickName\": \"not-working\",\n" +
                "            \"customerAccountType\": \"Individual\",\n" +
                "            \"type\": \"TRANS_AND_SAVINGS_ACCOUNTS\",\n" +
                "            \"isEligible\": true,\n" +
                "            \"isJointAccount\": true,\n" +
                "            \"jointAccountConsentElectionStatus\": true,\n" +
                "            \"jointAccountinfo\": {\n" +
                "                \"LinkedMember\": [\n" +
                "                    {\n" +
                "                        \"memberId\": \"user1@wso2.com@carbon.super\",\n" +
                "                        \"meta\": {}\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"meta\": {}\n" +
                "        }\n" +
                "    ]\n" +
                "}";


        String accountDetails2 = "{\n" +
                "    \"data\":[\n" +
                "    {\n" +
                "        \"accountId\": \"336304200\",\n" +
                "        \"accountName\": \"Special Monthly Interest\",\n" +
                "        \"nickName\": \"\",\n" +
                "        \"customerAccountType\": \"Personal\",\n" +
                "        \"type\": \"TRANS_AND_SAVINGS_ACCOUNTS\",\n" +
                "        \"bsb\": \"650-000\",\n" +
                "        \"jointAccountConsentElectionStatus\": true,\n" +
                "        \"secondaryAccountPrivilegeStatus\": false,\n" +
                "        \"jointAccountinfo\": {\n" +
                "            \"LinkedMember\": [\n" +
                "                {\n" +
                "                    \"memberId\": \"10902838\",\n" +
                "                    \"type\": \"OWNER\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"memberId\": \"12082104\",\n" +
                "                    \"type\": \"OWNER\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        \"businessAccountInfo\": null,\n" +
                "        \"secondaryAccountInfo\": null,\n" +
                "        \"isSecondaryAccount\": false,\n" +
                "        \"isEligible\": true,\n" +
                "        \"isJointAccount\": true\n" +
                "    },\n" +
                "    {\n" +
                "        \"accountId\": \"443174800\",\n" +
                "        \"accountName\": \"Rapid Saver Statement\",\n" +
                "        \"nickName\": \"\",\n" +
                "        \"customerAccountType\": \"Personal\",\n" +
                "        \"type\": \"TRANS_AND_SAVINGS_ACCOUNTS\",\n" +
                "        \"bsb\": \"650-000\",\n" +
                "        \"jointAccountConsentElectionStatus\": false,\n" +
                "        \"secondaryAccountPrivilegeStatus\": false,\n" +
                "        \"jointAccountinfo\": null,\n" +
                "        \"businessAccountInfo\": null,\n" +
                "        \"secondaryAccountInfo\": null,\n" +
                "        \"isSecondaryAccount\": false,\n" +
                "        \"isEligible\": true,\n" +
                "        \"isJointAccount\": false\n" +
                "    },\n" +
                "    {\n" +
                "        \"accountId\": \"481706409\",\n" +
                "        \"accountName\": \"Special Monthly Interest\",\n" +
                "        \"nickName\": \"\",\n" +
                "        \"customerAccountType\": \"Personal\",\n" +
                "        \"type\": \"TRANS_AND_SAVINGS_ACCOUNTS\",\n" +
                "        \"bsb\": \"650-000\",\n" +
                "        \"jointAccountConsentElectionStatus\": true,\n" +
                "        \"secondaryAccountPrivilegeStatus\": false,\n" +
                "        \"jointAccountinfo\": {\n" +
                "            \"LinkedMember\": [\n" +
                "                {\n" +
                "                    \"memberId\": \"10902838\",\n" +
                "                    \"type\": \"OWNER\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"memberId\": \"12082104\",\n" +
                "                    \"type\": \"OWNER\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        \"businessAccountInfo\": null,\n" +
                "        \"secondaryAccountInfo\": null,\n" +
                "        \"isSecondaryAccount\": false,\n" +
                "        \"isEligible\": true,\n" +
                "        \"isJointAccount\": true\n" +
                "    },\n" +
                "    {\n" +
                "        \"accountId\": \"637698506\",\n" +
                "        \"accountName\": \"Special Monthly Interest\",\n" +
                "        \"nickName\": \"\",\n" +
                "        \"customerAccountType\": \"Personal\",\n" +
                "        \"type\": \"TRANS_AND_SAVINGS_ACCOUNTS\",\n" +
                "        \"bsb\": \"650-000\",\n" +
                "        \"jointAccountConsentElectionStatus\": false,\n" +
                "        \"secondaryAccountPrivilegeStatus\": true,\n" +
                "        \"jointAccountinfo\": null,\n" +
                "        \"businessAccountInfo\": null,\n" +
                "        \"secondaryAccountInfo\": {\n" +
                "            \"AccountOwner\": [\n" +
                "                {\n" +
                "                    \"memberId\": \"12082104\",\n" +
                "                    \"meta\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        \"isSecondaryAccount\": true,\n" +
                "        \"isEligible\": true,\n" +
                "        \"isJointAccount\": false\n" +
                "    },\n" +
                "    {\n" +
                "        \"accountId\": \"666283203\",\n" +
                "        \"accountName\": \"Special Monthly Interest\",\n" +
                "        \"nickName\": \"\",\n" +
                "        \"customerAccountType\": \"Personal\",\n" +
                "        \"type\": \"TRANS_AND_SAVINGS_ACCOUNTS\",\n" +
                "        \"bsb\": \"650-000\",\n" +
                "        \"jointAccountConsentElectionStatus\": false,\n" +
                "        \"secondaryAccountPrivilegeStatus\": true,\n" +
                "        \"jointAccountinfo\": null,\n" +
                "        \"businessAccountInfo\": null,\n" +
                "        \"secondaryAccountInfo\": {\n" +
                "            \"AccountOwner\": [\n" +
                "                {\n" +
                "                    \"memberId\": \"12082104\",\n" +
                "                    \"meta\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        \"isSecondaryAccount\": true,\n" +
                "        \"isEligible\": true,\n" +
                "        \"isJointAccount\": false\n" +
                "    }\n" +
                "]\n" +
                "}";

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(accountDetails2);

        //JSONObject jsonObject = JSONObject.
        return jsonObject;
    }

    @GetMapping("/adrjwks")
    public ResponseEntity<JwksDto> getadrJwks() {

        JwksDto jwksDto = new JwksDto(
                Arrays.asList(
                        new JwkDto(
                                "RSA",
                                "AQAB",
                                "sig",
                                "adr11sp17",
                              "h8BNYxpB7yNCR8z2dsjXWCf40tPqxafXNnva0ULCKqIPrAIUDm_Q-OBTb2RVhfwI9ck9OXRSZ1xZ19L2xot8k_XF1Yko59_sskqLVeh9ALUMrGnnzMzamI7Fkczg70Pi2nJAD_g9hN5lXV7nt5nfiY09dgffTxFusZijOuVv6H8Xwz6M8PZyRCTEzTH8_umPkPXKlYo-Aj0tuGJf7upyGnfbfNbakxczvuNi7BYuA55Un5GR01nIRl43ethykN8B5Ru29TASJxW_CV3zuM2jg0MuOZb0twmx59g-yuoZFoxiOr0HwNi1LHOjxzW5OlLfX9JxhVwhISCgmcDDIgVQfQ",
                              //  "h55wLtHf0v8KpNf7NVA6ggdHsIGobu_g_4xhezfzV6bIRgrbCJZS2SNEWX3wM9sSZYO7ztlIo75i1PwSHcSqhPH8r037IA7IvW9_I_d3DQo0tvYku37N100lz80BWe7cEBgznjvRAmHKhj9fzegEbQb_tVdDlGGm4riEk8ETlhZDBIHbvlctoPD55F__tJinx3WUQ8BgwSEKq5_PKSJWJPDw2u9RkRWPAjMjq8G23nBkvARWV5YpJDAkE7_T5n4GZ1qcrgve2i9BpdBzG5H41y4JmMmB8LBJCKq-EDCa5pPOCoVSRHLoCbR0lGO4YqNitcvitjmN0sl76u6MUHfMbQ",
                              //  Arrays.asList("MIICpjCCAY6gAwIBAgIGAYQ9nYmdMA0GCSqGSIb3DQEBCwUAMBQxEjAQBgNVBAMMCWFkcjExc3AxNzAeFw0yMjExMDMxMzEwNDVaFw0yMzA4MzAxMzEwNDVaMBQxEjAQBgNVBAMMCWFkcjExc3AxNzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIeecC7R39L/CqTX+zVQOoIHR7CBqG7v4P+MYXs381emyEYK2wiWUtkjRFl98DPbEmWDu87ZSKO+YtT8Eh3EqoTx/K9N+yAOyL1vfyP3dw0KNLb2JLt+zddNJc/NAVnu3BAYM5470QJhyoY/X83oBG0G/7VXQ5RhpuK4hJPBE5YWQwSB275XLaDw+eRf/7SYp8d1lEPAYMEhCqufzykiViTw8NrvUZEVjwIzI6vBtt5wZLwEVleWKSQwJBO/0+Z+BmdanK4L3tovQaXQcxuR+NcuCZjJgfCwSQiqvhAwmuaTzgqFUkRy6Am0dJRjuGKjYrXL4rY5jdLJe+rujFB3zG0CAwEAATANBgkqhkiG9w0BAQsFAAOCAQEATq2pAuimYNbRaIu8bDEeFTgJ8UyqT38PAAkHtyzu48d6BeApHiKoKw3pI1M0EStKm6czRA2rB9v9kVXgHPrin19IgiPqhXeoOZC9VDliNvatJW8ISjvLURrwNHAn9XBSFSloEyO/a2kQR4RHQFLqUSvj8clDkLpHysSUnzKb4gWpDNBDSYOWsksvuPCnJF+/R8wjTB4vVaGk2ePbZWIkyZkrPF6kpi3mQtbffFf1MQ6kEaoWrSGJ+qnROaGNd8hdJpcuRo4WImDlDCtrkcsWhlXoKbLeW68dANiXDVp0vgsxHK/WD83+1UetnFKTJIIJ1Bk2rgvwuSUn99dqmtA6VQ=="),
                             Arrays.asList("MIICpjCCAY6gAwIBAgIGAYqvcrgYMA0GCSqGSIb3DQEBCwUAMBQxEjAQBgNVBAMMCWFkcjExc3AxNzAeFw0yMzA5MTkyMTU3MjVaFw0yNDA3MTUyMTU3MjVaMBQxEjAQBgNVBAMMCWFkcjExc3AxNzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIfATWMaQe8jQkfM9nbI11gn+NLT6sWn1zZ72tFCwiqiD6wCFA5v0PjgU29kVYX8CPXJPTl0UmdcWdfS9saLfJP1xdWJKOff7LJKi1XofQC1DKxp58zM2piOxZHM4O9D4tpyQA/4PYTeZV1e57eZ34mNPXYH308RbrGYozrlb+h/F8M+jPD2ckQkxM0x/P7pj5D1ypWKPgI9LbhiX+7qchp323zW2pMXM77jYuwWLgOeVJ+RkdNZyEZeN3rYcpDfAeUbtvUwEicVvwld87jNo4NDLjmW9LcJsefYPsrqGRaMYjq9B8DYtSxzo8c1uTpS31/ScYVcISEgoJnAwyIFUH0CAwEAATANBgkqhkiG9w0BAQsFAAOCAQEAXJaArXH2zn+y+DtkVKkp54p8QjZPyT4Z8ifPbkfjP5Y8p8MbaigrNbrNH59VlKEMlwYu6bzFIe7h8p4R9LVhqkP/tGOGF8SC0YC7KdMPmfjFdHeCOn/fMBNhqXjIo4yw9PeFMHDyebwaywfKoZ9fVeR5rBjDoSMnmE/JrqPU4eZUcZvxw7I2Zh6A9vSyNopKx3pgiZZY3J8jyan4c778/V+aI091IKHbr3Nqo3j7/FSraRhHyI5PsdGWy+UpK6eOoe1SDhKehp4FLFCgbdaCSCH3h1drfJ6aVUME8OH7FdnyNjUnd7BTxmmpTk8Ow5qGFoNT1UwxYqZpVH+nFFfRNA=="),
                                "https://mockregistry.com.au:8443/idp/.well-known/openid-configuration/adrjwks"

                        )
                )
        );

        return ResponseEntity.ok(jwksDto);
    }


    @GetMapping("/adrjwks2")
    public ResponseEntity<JwksDto> getadrJwks2() {

        JwksDto jwksDto = new JwksDto(
                Arrays.asList(
                        new JwkDto(
                                "RSA",
                                "AQAB",
                                "sig",
                                "adr01sp01",
                                "m_hm0ihl65L8Upaz3tNIIXS8xJGuyF2cs8kRhQt0Rm8oOJwJzir2U1yCqN5T2-ZlIsgHXN-Z1FjXcwOPHf_tyv1EukY_5m6-utt4KVz7iZd5KOrkvxjZYO60e_radC9vZVr5NWyPkv5PyHw5I8FgPg9YKf-ZDKOUQu6zjOmQA0oBieSiIQr49r_FQ2nzqe-ADfFkejdmtwkzOy_ZTdzWRkGIk9Aa0NM441emipSJaLcYQYWAp4iltuJADj5Jnn_10244EAMsP0M2onyl55TmWr5aGP1UGekNBWRGSLRqREDJyaVAcyqICRD_LrzT4-AsvavxeQJvuTvz3QdvcEy-_w",
                                Arrays.asList("MIICpjCCAY6gAwIBAgIGAX9tqWllMA0GCSqGSIb3DQEBCwUAMBQxEjAQBgNVBAMMCWFkcjAxc3AwMTAeFw0yMjAzMDkwNzUxMzNaFw0yMzAxMDMwNzUxMzNaMBQxEjAQBgNVBAMMCWFkcjAxc3AwMTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJv4ZtIoZeuS/FKWs97TSCF0vMSRrshdnLPJEYULdEZvKDicCc4q9lNcgqjeU9vmZSLIB1zfmdRY13MDjx3/7cr9RLpGP+ZuvrrbeClc+4mXeSjq5L8Y2WDutHv62nQvb2Va+TVsj5L+T8h8OSPBYD4PWCn/mQyjlELus4zpkANKAYnkoiEK+Pa/xUNp86nvgA3xZHo3ZrcJMzsv2U3c1kZBiJPQGtDTOONXpoqUiWi3GEGFgKeIpbbiQA4+SZ5/9dNuOBADLD9DNqJ8peeU5lq+Whj9VBnpDQVkRki0akRAycmlQHMqiAkQ/y680+PgLL2r8XkCb7k7890Hb3BMvv8CAwEAATANBgkqhkiG9w0BAQsFAAOCAQEAg2MUbrIT8dQEZbQt/M+TLFnGUb9y2GWLL2eIyabfk/Lpomczs8JlWnlIM02sLQ/deMyRTTUdhuuMQXd1+B8CIiaC9pJQB4SmRxpyUWf9ill/SEpOZ04oIiyBPx8UFhG7KeU2rIW5/QOcce4geDySqSu3ZMOSXqO3ItRRCY8ALydPH7UE9jEpTexufxmjPJNGiiTbjqd7rHB9wJKZZFHDzh1f+CodTqdy548dH31Fl+Hga9prF+pr+p6XErubrcpXoWzkxDukS7b8khE1jjKgLX0d1AzmHgreuscsixkjhxBdCkS8eQRo3QYwU+3UU8oH+mm46jOuqUlole7XI0wChw=="),
                                "https://mockregistry.com.au:8443/idp/.well-known/openid-configuration/adrjwks"

                        )
                )
        );

        return ResponseEntity.ok(jwksDto);
    }


    @GetMapping("/adrrevokedjwks")
    public ResponseEntity<JwksDto> getRevokedJwks() {

        JwksDto jwksDto = new JwksDto(
                Arrays.asList(
                        new JwkDto(
                                "RSA",
                                "AQAB",
                                "sig",
                                "adr02sp04",
//                                "PS256",
                                "p6A1eDTixohTG-6kaRaXLC_C8B5sE1Mrl-u5msT5k3TgbikiUGyK1k8rz8osfcOYTtDjejzsut3j9BAY0p-8nO-6h8CqpG777zNJNbGM4oJQYLQXxoVrFROxDsZ0g8anFL76Pid9u-Aw3tgpJJbu3CHTShoP5WdcDW7xBsvI18ZavA4g2M5YWYMZpXvkAJwnO5ZS2P-zxpGUbu-dvLyVlrOiLlRFIepHeX8pxS9Dv7dRaKz1u0aJZQ8kKxTIPtLKx6_ygYtaUIVVuqZ-sytp-QlTLBiqgixaiF9IiSPBjynoW8FDduMtLfcGZZe5Fqgsh5vdEY1108NTmGy1lYDh0Q",
                                Arrays.asList("MIICpjCCAY6gAwIBAgIGAXd7csiMMA0GCSqGSIb3DQEBCwUAMBQxEjAQBgNVBAMMCWFkcjAyc3AwNDAeFw0yMTAyMDcwNzQ0MTZaFw0yMTEyMDQwNzQ0MTZaMBQxEjAQBgNVBAMMCWFkcjAyc3AwNDCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKegNXg04saIUxvupGkWlywvwvAebBNTK5fruZrE+ZN04G4pIlBsitZPK8/KLH3DmE7Q43o87Lrd4/QQGNKfvJzvuofAqqRu++8zSTWxjOKCUGC0F8aFaxUTsQ7GdIPGpxS++j4nfbvgMN7YKSSW7twh00oaD+VnXA1u8QbLyNfGWrwOINjOWFmDGaV75ACcJzuWUtj/s8aRlG7vnby8lZazoi5URSHqR3l/KcUvQ7+3UWis9btGiWUPJCsUyD7Sysev8oGLWlCFVbqmfrMrafkJUywYqoIsWohfSIkjwY8p6FvBQ3bjLS33BmWXuRaoLIeb3RGNddPDU5hstZWA4dECAwEAATANBgkqhkiG9w0BAQsFAAOCAQEAR4zzwXVRFEnf3xZ8JdBu0nS2EhNgctU0JFuuqvIyl6f4WQCAAgzoDlIdnJ+2TkmtgkiYmbnhfWfga6FHz00aJjuGyfvdidvKzxX2sixU5ROU1+cW27d1mhq6bYwtbj/O77yRaT4rlRHSGrNRIEj4JMl8gNuED/sVf2R3YTslYY1yzVghd1ywko7i5o5OhkfRwCgCjCBHGGxmcOkVqI3J6Ydy9yppzvFlnJjxBxoUjlgTscC79z4L5VXIi5n+xDdRqyDClBaTNjfuGDviitWVS+Bj9+8IyYC0B12RZb/g3ehAnIvec3U3hRgMEmHSv3Za0HD09mJkU/dAWYhKfgXkug=="),
                                "https://mockregistry.com.au:8443/idp/.well-known/openid-configuration/revokedadrjwks"

                        ),
                        new JwkDto(
                                "RSA",
                                "AQAB",
                                "sig",
                                "adr03sp06",
//                                "PS256",
                                "k5m9pkICfOnTLu_N4gd4o44RywOhA1RiWUcRzq5eXdCL3FdnPdhlM8NoiuUFDQS5-VKm1OygL1KQTm4gP6ND52Jb9Pk6bZ8yQskE5epzZl4jWrLZRSC_s0SQLVaQDWqozSWSoX47RmDpKqTNbQNm5-3toDHB8TbFtjzNuFt4NsYSB2rbMhcIWPCp36BkTzfjmpvI2ub4rBQ5PYGcQDhZ58uzue622aAc689pI4S7U1Uly6AvYyhPqMzcf_0H7JAHkjm_x3DfToyV2UWUmfBWuYOR6usvN4Ug_wMjiY6qJivkELgslAdp8cYj0wp1uvJFsdXSfzROfqqahPm2-K7hvw",
                                Arrays.asList("MIICpjCCAY6gAwIBAgIGAXeu9+fFMA0GCSqGSIb3DQEBCwUAMBQxEjAQBgNVBAMMCWFkcjAzc3AwNjAeFw0yMTAyMTcwNzUwMThaFw0yMTEyMTQwNzUwMThaMBQxEjAQBgNVBAMMCWFkcjAzc3AwNjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJOZvaZCAnzp0y7vzeIHeKOOEcsDoQNUYllHEc6uXl3Qi9xXZz3YZTPDaIrlBQ0EuflSptTsoC9SkE5uID+jQ+diW/T5Om2fMkLJBOXqc2ZeI1qy2UUgv7NEkC1WkA1qqM0lkqF+O0Zg6SqkzW0DZuft7aAxwfE2xbY8zbhbeDbGEgdq2zIXCFjwqd+gZE8345qbyNrm+KwUOT2BnEA4WefLs7nuttmgHOvPaSOEu1NVJcugL2MoT6jM3H/9B+yQB5I5v8dw306MldlFlJnwVrmDkerrLzeFIP8DI4mOqiYr5BC4LJQHafHGI9MKdbryRbHV0n80Tn6qmoT5tviu4b8CAwEAATANBgkqhkiG9w0BAQsFAAOCAQEAdU4kSEIZvQlwQUhV8JlsQIyCkpaobFfOEarLShLxNf+qJqdXvhLfxbv4tWmwxZgIuIeNZ2kfALjTWc4V4WV13jB3G0xSYf7HYadFnO861HDAAoHHQDi9wmnwFiQM9x7rLF9F/u1K1T+YvExi/jy1TPfcAdLXBf3IU89lS0XmARJ4aJ1RSFP4wtm+XMGihwr3hejYyjF5Xb+7t68KbysDtPmdEe17Igf7uoriEr92w/g7iC2Ey0sE87mTLwWvJWeM2gnS7WRqSuZAU5HSv90lbW3SYpqd92JQ/RmI2W5PKBpqjQzCcFRH2yIwWtjsjS+CG65Ug+ndOQ+ovBDpAoTpdw=="),
                                "https://mockregistry.com.au:8443/idp/.well-known/openid-configuration/adrjwks"

                        ),
                        new JwkDto(
                                "RSA",
                                "AQAB",
                                "sig",
                                "adr04sp08",
//                                "PS256",
                                "gTVyCpQoEY6PD3sQfhyY062yN4cmJkT3-e_ywDCR5Joa_9SrjvuV0prKuQYp-dnv39THvpJUviBIgecAvS2Gl_EBAgiuyo_fOj6lcWGcmPU3px33v3qsfPqMDXSEYSQYGGFODSFQG6MgHpjSPt2mySQ00ULpHPB6H3IdOf9qvjCQeUZo52PF0Jxv95nTvSvS7gpmWZ8aI6hiT8mOlVN_oF7qiN9ru3IPgPeuOKSSfijdJqmae9-d9uPvM1COsse6dmN26U1DJPCdG8FSQkEl3unUoxhk5_n7SLo1UYbZR11WlG-wQ7qSoQYZhmpoIWzVIu1Ba7WRlhsTqZOlYzevRw",
                                Arrays.asList("MIICpjCCAY6gAwIBAgIGAXevkibeMA0GCSqGSIb3DQEBCwUAMBQxEjAQBgNVBAMMCWFkcjA0c3AwODAeFw0yMTAyMTcxMDM4NDdaFw0yMTEyMTQxMDM4NDdaMBQxEjAQBgNVBAMMCWFkcjA0c3AwODCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIE1cgqUKBGOjw97EH4cmNOtsjeHJiZE9/nv8sAwkeSaGv/Uq477ldKayrkGKfnZ79/Ux76SVL4gSIHnAL0thpfxAQIIrsqP3zo+pXFhnJj1N6cd9796rHz6jA10hGEkGBhhTg0hUBujIB6Y0j7dpskkNNFC6Rzweh9yHTn/ar4wkHlGaOdjxdCcb/eZ070r0u4KZlmfGiOoYk/JjpVTf6Be6ojfa7tyD4D3rjikkn4o3Sapmnvfnfbj7zNQjrLHunZjdulNQyTwnRvBUkJBJd7p1KMYZOf5+0i6NVGG2UddVpRvsEO6kqEGGYZqaCFs1SLtQWu1kZYbE6mTpWM3r0cCAwEAATANBgkqhkiG9w0BAQsFAAOCAQEAF2cJiy2tDNVogakPEGvD3HA+JJsxIZnU7TSQZUTBBY7QfElxHY5dp659fHqIisWvgvLGb2hrup5eAHN0YsuhQDIR5rYV4XFGR2VFOw602WyWxC/nzsv4O5iOBlbEDHjF0ihFgyM6/lusncyL/L+3UEVD8jds6m4Exot1qpedFvJ7q9+YF8ET/lqXcF1nw/wiqdE2SMm1+HundEWM9qPsV/jPbJwC+ty8w0U3PaCLtYVYpAxdZEHIN+zHAVCLO/ZeSHfpw9tkHK5ptLrkwcnTX6VfugPnfgZ6Gb3GOUQAl/NIhkp9HZlckSCDkjXuHCdhXgaBG/L3F2QcnFuolfWgog=="),
                                "https://mockregistry.com.au:8443/idp/.well-known/openid-configuration/adrjwks"

                        ),
                        new JwkDto(
                                "RSA",
                                "AQAB",
                                "sig",
                                "adr05sp09",
//                                "PS256",
                                "n4dZu5pAsAXerK-aR64ILRBG4FBVEOM44tc1Q-9rQUBRBkr8WExNPOEYl3zRSXog93SrV-KEcIsNDVmeVQ6UQ2zXuNQ7H8d7VkDM5-vF6CqfjzRgoTsQCiE7Aq3Ok2QcL3APxZn5icajFmckHJa7OzL4VVLV47HDuIlFcmm_B0Bre0bGEeS7G3C_hXSWWVAkT6eiRTMyg425NRoys3Nz32KUI5iELzWSwh5HR1UamEjtxgT1N9DIaRnj6TKbUD12AsBSDa_UFPizY94oCcCoir2xMpQs3NhAY_QDWsNyqfrafxQ9bNpHj4QVecLVOkTORy0Hoy5F4-DaPPHt4pTVvw",
                                Arrays.asList("MIICpjCCAY6gAwIBAgIGAXevlVPJMA0GCSqGSIb3DQEBCwUAMBQxEjAQBgNVBAMMCWFkcjA1c3AwOTAeFw0yMTAyMTcxMDQyMTVaFw0yMTEyMTQxMDQyMTVaMBQxEjAQBgNVBAMMCWFkcjA1c3AwOTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJ+HWbuaQLAF3qyvmkeuCC0QRuBQVRDjOOLXNUPva0FAUQZK/FhMTTzhGJd80Ul6IPd0q1fihHCLDQ1ZnlUOlENs17jUOx/He1ZAzOfrxegqn480YKE7EAohOwKtzpNkHC9wD8WZ+YnGoxZnJByWuzsy+FVS1eOxw7iJRXJpvwdAa3tGxhHkuxtwv4V0lllQJE+nokUzMoONuTUaMrNzc99ilCOYhC81ksIeR0dVGphI7cYE9TfQyGkZ4+kym1A9dgLAUg2v1BT4s2PeKAnAqIq9sTKULNzYQGP0A1rDcqn62n8UPWzaR4+EFXnC1TpEzkctB6MuRePg2jzx7eKU1b8CAwEAATANBgkqhkiG9w0BAQsFAAOCAQEAbUyfUJcPCUikWwvL9mIEu9oN+smrJn67jz4bCXC5hu5RSEgewmvJ0uyaEbfoiQk73iYkW+mAhgSng/nc4ciKhqQAGWUp9hDyyP27Ulc+QuNO3bcUKtV8CJ9kvt9mOpukse2tCKoJ74AZKiGOs7cQop83AlbzK9qiCCa/I29IF0a2Uj+eoOmIqae2Jqzi2EalW6S/lh4enyccvdWVIodDfpIl6GaxQcQUjVWTpKYUBjZ+fPjuARl81qdp/zL1yrLKqwst9R8Rgb0wXbRFnuHls9mI2nw8ZbTyPUiXcmsOgsuQqRhsNdKvRbtCX5UG7Hsj8ySf9ksoLMYt7N43vGRzXQ=="),
                                "https://mockregistry.com.au:8443/idp/.well-known/openid-configuration/adrjwks"

                        ),
                        new JwkDto(
                                "RSA",
                                "AQAB",
                                "sig",
                                "adr06sp10",
//                                "PS256",
                                "wRLjPS5Z-9_iYW9h5Nxz_UT99tMDp7nT9Ezogc7zwPlGtFLBWpcWKS96esrjGxs6bR893rPTgyRbDKQg2Lw3yVOhyV0nee9cMnuz9DckobbzZduB882nrrnfy37DapWkNSlpYGVmmmX49sC2OtiwS2MxkzY5JktGOoJXk_G1haHyB6lvsCm0XaJxG-xNxig0B4gBs6P7lapj73o-NGsqbyn998Zr3DN2rR_ocCMR9qXU-GtwKr3F5UmYMaVbNYJ5eAlTucHuBD571EPGseFJq8zw1b9FMbKzY56lTrBCG_8dRb3bbWeGxE6VaH34Ez1MJ3mSqmlxr8UZnFU_4WQGUw",
                                Arrays.asList("MIICpjCCAY6gAwIBAgIGAXevl3NDMA0GCSqGSIb3DQEBCwUAMBQxEjAQBgNVBAMMCWFkcjA2c3AxMDAeFw0yMTAyMTcxMDQ0MzRaFw0yMTEyMTQxMDQ0MzRaMBQxEjAQBgNVBAMMCWFkcjA2c3AxMDCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAMES4z0uWfvf4mFvYeTcc/1E/fbTA6e50/RM6IHO88D5RrRSwVqXFikvenrK4xsbOm0fPd6z04MkWwykINi8N8lTocldJ3nvXDJ7s/Q3JKG282XbgfPNp66538t+w2qVpDUpaWBlZppl+PbAtjrYsEtjMZM2OSZLRjqCV5PxtYWh8gepb7AptF2icRvsTcYoNAeIAbOj+5WqY+96PjRrKm8p/ffGa9wzdq0f6HAjEfal1PhrcCq9xeVJmDGlWzWCeXgJU7nB7gQ+e9RDxrHhSavM8NW/RTGys2OepU6wQhv/HUW9221nhsROlWh9+BM9TCd5kqppca/FGZxVP+FkBlMCAwEAATANBgkqhkiG9w0BAQsFAAOCAQEAqU87nWf6olqy1nvce5hsPrLEqVkueBcz9JYmlomrG9C+iWoZq2tCi90kV+IbOS6VMQjfOHyce+pHs8BDRI0I2Z3K8l7/4no4pqBUIV12jlniKtEt1DXY2cEc+CqWZhDublZMx3J7N4hZFY6SvaA1gXLk7JSwA1582rkMDBmekyjmb6A2ZxKaG1DRQgo0a/B7gzS1dAobHTm1P2IlmagTkF6lRlzgVp+BaIfbLeXKG35dZwr9WEkdqvgU/U4IMvPO4T9sZlpMWD5iFRk459pQqTicgg7txEqzdUGRfsKq2s/eb2Ktu842dE+TasgUc4Wc+Klo52PX7AnAK0Z0SQKyLA=="),
                                "https://mockregistry.com.au:8443/idp/.well-known/openid-configuration/adrjwks"

                        )
                )
        );

        return ResponseEntity.ok(jwksDto);
    }
}
