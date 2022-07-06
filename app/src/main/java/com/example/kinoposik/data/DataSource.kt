package com.example.kinoposik.data

import com.example.kinoposik.domain.models.Movie
import com.example.kinoposik.domain.models.MovieCategory

class DataSource {

    fun getMovieCategories(): List<MovieCategory> {
        val scrubs = Movie(
            title = "Клиника",
            img = "https://avatars.mds.yandex.net/get-kinopoisk-image/1946459/4f0c84e5-6dcd-4253-ab6d-c070af4f71c0/300x450",
            description = "Хаотичная жизнь больницы глазами интерна-фантазера. Главный медицинский ситком нулевых",
        )

        val attackOnTitans = Movie(
            title = "Атака Титанов",
            img = "https://avatars.mds.yandex.net/get-kinopoisk-image/6201401/70c27684-81cd-49e1-bf39-250b26702864/300x450",
            description = "Подросток мстит гуманоидам-людоедам за убийство матери. Культовый аниме-сериал по постапокалиптической манге",
        )

        val theBoys = Movie(
            title = "Пацаны",
            img = "https://kinopoisk-ru.clstorage.net/d1S6p1184/6c482f93ft0/cT7_d0RCKmbp1hshjb7uBPs_SApjJfMP51oNc6_prcQw4gMHuGWJMWuwjWulL_Vn3fV90mj4ANT5--htb48oZORu6-CWkeny_lDdtNopuoKoaYna8DfmnuAe2iV4ImHOPGhfjjevgTpz4R17oniiMc3l6kT4r8bEqadyfSoPN_DzvfayCFWq7q3HVaGH9mSAIvnJzzHlsMk5m8W56eUjjX1u3EW-ZkM5OWcTc_s4qbfLYqpF9yuRieFpfmQjzf09cnW2f4aRK-LuQZPqRryhQW10Q8I1bzCHvRSEtimuIke5a1JBO-eFNP0smrQ6PGO4huIpRX0k00QlJT5vbc05szV-urXDmqrpaE7Wa4K14gOs-sGFeCb3iLpbi_OpaeyD-CwRTPNpCHrx5lU2sHnhvAQpIAJwoZeBJWQ-LeIHe_P9MLSwjFhs4WOFVa3C9GwIobWNQrsquMs0Xsk2YaxnxLIjVsG2aI77OCJQNbj3oPaEKGHFPSQXgWBkNGBvC3G_8nL6PcqdrezoTVGihXrrRmywQgl6J_wCeBmG_S3vLoI1rp2J_i4OdLppVbayMa15z-rox76kEQQtLj-jpke9ebp9ujpG02Jh5oxYasC8LYhtMMmF9a13yb7Ui_0ppSLCcCbdyTtgC7u27Ja0N_5p_8ehK8C97J0EKep27GeHNTC9cf7zglTgKqnIkOwPNOfPabrCRfQu8o98kQe-paxqxjWtUgx9YYn6tC-S-DXzaPPDYW_MMGBVwWnk_ODtDnn9fX_ydUIbIu0myxZrRbTvg-h2T0675jjCtZqENmghpYfwIh7PM2SANrDmUnN5MOR3Be2ohPjlloxl7bBnKIL_s7d1fvrNVGjsZEffrMv7qg6g9UXFfCbyBjeQRvivJW5D8GmbRD7rhbJzJpn6PfMtss8orIQ95p4CrGT5Z62IObDwsLf5SB1p4unJGKjOtqIB6jlES7au-ENwlIx56i0rAHGhnAx2qUB0vu1TNTj-Y7vAIGoAuKRTxqrgPO6jzrI4OHc1MsRdYCshDJ8txLblg6M8DQ3ybXAKtVbH-iAgJUw_ZtGI8GhFPTIn1P-xsyZzDSyszPct3EhnrDat485wuj9w9D-KGCRha49Z7ET7KcIoNs3DcG10wbaVzn5o5CiLtqzUhbmrzvszbBE3uz_g_8IkoMO-6JjOJ6Ez46sPtX_0P7M3AFFr6eRAk2tNeWyPbjdDxnFnMsM8U8z4pKAkzDSiWo63J4LwdCCRenyxa3kDa2ANOC9fhWVi9ybsTb08N_2yOE4UJO3jQ57piLFsgiW3ws55bbTLdJiNtaJvbsb3atbMsiQKcXLmFvo8s6M-Bm-iyzXoWcJvYvYnZ40-PX_3dPZM16cjaMSb6AN1a4blvY0N8q-6A7YZwjDmaGMDuGBRxrNpSnq5bxlwdLAuec-gIUg1ZN0IaKS3biyDtruw9_fyCRttq-RGEyJOfGMCIjYNzzNtssj-2w-57iGmTPkgGwEwKMN-M66a-zf_YnODoizAOW6fwySpdODng_q99fe_sAPZZKtsgRkkhbTtC-n-T8_1ZbiLcVLCc6yj4oL3YhxDdWhK8z1lWPV_tmKzyuGnyn0nXQRlJPlgpQg6-bxw8XJD26-kqISe7QC15ocreY8McqgzgjDSy7ZnLO8EtqwZjjJuCHV6rFl2MPEp8ozqrUq4K5TI7Sv1JeKMvrt5PfF3DR-lYyfEW2oCveXOJHUCz7VqOcv9ncM4p2Ajy_2kWQN37Eg7OyhZ8_NxKf9HKuvPOe_fySgpOO3ty_N8OnZ7uEOQZGXnw5BiiHaqDqMxgMn6pLTIPxXCfeikYwW8ZlsOfuOGcnjv3XD3t603Q29pB_Ug1slsqTblYw85cL16PDiJk-2m5MwU4M16a08hMEiKMu-7SLgaxrttZiXLMaMbRbkmins66lS7fThovwcn4I4_5lZB5Sh7qerNtTv9czKygFtpbWGAW2EIuyHA6XcHC7stvw7_k8k55-agBPWj3Ux-I8Mz864cdrpzJv5F4OBKuibXg2GlPiwmQzf1Pb5-dYrQIWHvhlErQDOnw6j1y4N6KXuCNtsNum2tao6wYtiPsq2J-X4knHT7vyS6AKkgwjlh3wvsZjOgYAq6_7Oye3IF1CLiLA9XIw_3K0Ni9s1MuixzTvoUArjsp-5H-qvcwfouDL65YVT0NDji-Yfs40x64RDLbaN26WONdTdy-rmzjJxp7G_JECtG-eqE5D2CQn0s8Q69kAu9rWGmjr5oFIi2r0569imev7P0YDYMKqHPem9fwGlhNKSng_t9efc2cgwZ521rRtYrzTwqB2O5C0U9r_eLNJUCcifh5kr9ZlzGe6vFerkvWTA4M-q3hG1sBnpjU0xtq7Ftqk51vbB-N7sCEeylpMVbasb6okRkeU0Ee2i7x_JQBPtorS9LvaVbhzIsyrX46t17svPk9sUi6wZ-Kx-FryA4LavCujexuT1_hhpjqmlGlOTEemUDLPmBxzave0l0kYbxLmvrT3JhUMf45IF-MKySv3j5InNCb2DCPiaVxKFrOCetBb6xe_12fYoSZyJnzFNshXTqjGP1RYY1qPmKsJ1CM2UmY4Y4LpJOsuUCcfTmmn1wMaM2QGwjzHmlWUTla3DoaIS58HA2d78LFaArJYdcoEp7L4SgdQjKumV2B3hUgzng462GtSUYyTnjRfX27pDyOr-ueMtk4MC2YJGL4Cu8ZagL8LXyvzW3TRxhaylHli1Hfa8CJjALj7lmMwDwEYe-qaFqwHxgHUz37IPydOJd8zQ_KzKMrGlHOaRdieZlOS7sTzny_XdyNUhToOTkzp0hAHOtwmr0jAby5XMBNlZDc6hvrcJyK10Es-5O-nKn3fcytCN-guplQncoFcVi5Pel58byv7D59jAKU6vnIcYc4gLzqkOrecKDPW05DHETRPumY-JGvaZbi70gyvGyb512snHi98Ik6o5-a12Bro#DSD",
            description = "Отряд простых смертных ставит на место продажных супергероев в трико. Дерзкий сериал по комиксу Гарта Энниса",
        )

        val tvShows = MovieCategory("Сериалы", listOf(scrubs, attackOnTitans, theBoys))
        val comedies = MovieCategory("Комедии", listOf(scrubs))
        val actions = MovieCategory("Боевики", listOf(attackOnTitans, theBoys))
        return listOf(actions, comedies, tvShows)
    }

}