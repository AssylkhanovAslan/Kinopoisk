package com.example.kinoposik.repository

import com.example.kinoposik.models.Movie
import com.example.kinoposik.models.MovieCategory

object MoviesDatabase {

    val animesList = listOf(
        Movie(
            "Унесённые призраками (2001)",
            "https://upload.wikimedia.org/wikipedia/ru/6/61/Spirited_away.jpg",
        "Девочка должна спасти своих родителей в мире духов. Шедевр Хаяо Миядзаки, фаворит анимационных рейтингов мира"
        ),
        Movie(
            "Ходячий замок (2004)",
            "https://upload.wikimedia.org/wikipedia/ru/4/40/Hd.jpg",
            "Злая колдунья превращает юную Софи в старушку. Волшебная сказка о силе любви по мотивам книги Дианы Уинн Джонс"
        ),        Movie(
            "Твоё имя (2016)",
            "https://upload.wikimedia.org/wikipedia/ru/thumb/2/2c/Kimi_no_Na_wa.jpg/345px-Kimi_no_Na_wa.jpg",
            "Токийский парень Таки и провинциальная девушка Мицуха обнаруживают, что между ними существует странная связь. Во сне они меняются телами и проживают жизни друг друга. Но однажды эта способность исчезает так же внезапно, как появилась. Таки решает во что бы то ни стало отыскать Мицуху."
        ),        Movie(
            "Принцесса Мононоке (1997)",
            "https://upload.wikimedia.org/wikipedia/ru/3/38/Mononoke_Hime_DVD_Cover.jpg",
            "Заколдованный принц и лесная принцесса борются с древним демоном и его рабами. Аниме-блокбастер Хаяо Миадзаки"
        ),        Movie(
            "Форма голоса (2016)",
            "https://upload.wikimedia.org/wikipedia/ru/5/55/Koe_no_katachi_cover_01.326x486.jpg",
            "Молодой человек Сёя Исида внезапно осознаёт, что в школе умудрился превратить жизнь одноклассницы Сёко в ад только потому, что та была глухая. И теперь, хоть и запоздало, парень понял — чтобы сказать нечто важное тому, кто не может тебя услышать, вовсе не обязательно использовать голос."
        ),
    )

    val comediesList = listOf(
        Movie(
            "Иван Васильевич меняет профессию (1973)",
            "https://static.hdrezka.ac/i/2014/4/3/e417e65ea9f13ym33t54n.jpg",
            "Иван Грозный отвечает на телефон, пока его тезка-пенсионер сидит на троне. Советский хит о липовом государе"
        ),
        Movie(
            "Джентльмены удачи (1971)",
            "https://upload.wikimedia.org/wikipedia/ru/thumb/9/93/1972_dzhentlmeny_udachi.jpg/413px-1972_dzhentlmeny_udachi.jpg",
            "Воспитатель детсада внедряется в банду матерых рецидивистов. Евгений Леонов в разошедшейся на цитаты комедии"
        ),
        Movie(
            "Операция «Ы» и другие приключения Шурика (1965)",
            "https://static.hdrezka.ac/i/2014/4/1/k87b1d6e74a10bn24g16l.jpg",
            "Похождения хронически оптимистичного очкарика. Блистательная комедия Леонида Гайдая"
        ),
        Movie(
            "Один дома (1990)",
            "https://upload.wikimedia.org/wikipedia/ru/thumb/0/03/Home_Alone_dvd_rus.jpg/405px-Home_Alone_dvd_rus.jpg",
            "Мальчик-озорник задает жару грабителям. Лучшая комедия для создания праздничного настроения у всей семьи"
        ),
        Movie(
            "Бриллиантовая рука (1968)",
            "https://upload.wikimedia.org/wikipedia/ru/thumb/1/17/%D0%91%D1%80%D0%B8%D0%BB%D0%BB%D0%B8%D0%B0%D0%BD%D1%82%D0%BE%D0%B2%D0%B0%D1%8F_%D1%80%D1%83%D0%BA%D0%B0_Poster.jpg/360px-%D0%91%D1%80%D0%B8%D0%BB%D0%BB%D0%B8%D0%B0%D0%BD%D1%82%D0%BE%D0%B2%D0%B0%D1%8F_%D1%80%D1%83%D0%BA%D0%B0_Poster.jpg",
            "Контрабандисты гоняются за примерным семьянином. Народная комедия с элементами абсурда от Леонида Гайдая "
        )
    )

    val cartoonsList = listOf(
        Movie(
            "Тайна Коко (2017)",
            "https://upload.wikimedia.org/wikipedia/ru/d/d7/Coco_%282017_film%29_logo.jpg",
            "Юный музыкант Мигель попадает в мир мертвых. Трогательная история о любви без границ, получившая два «Оскара»"
        ),
        Movie(
            "Король Лев (1994)",
            "https://upload.wikimedia.org/wikipedia/ru/6/62/Lion_king_ver1.jpg",
            "Львенок Симба бросает вызов дяде-убийце. Величественный саундтрек, рисованная анимация и шекспировский размах"
        ),
        Movie(
            "ВАЛЛ·И (2008)",
            "https://upload.wikimedia.org/wikipedia/ru/c/c4/WALL-E_poster.png",
            "Люди покинули Землю и оставили робота собирать за ними мусор. Экологический шедевр Pixar"
        ),
        Movie(
            "Шрэк (2001)",
            "https://upload.wikimedia.org/wikipedia/ru/thumb/3/39/Shrek.jpg/400px-Shrek.jpg",
            "Огр-мизантроп спасает принцессу, чтобы вернуть свое болото. Революционная анимация о том, что красота — внутри"
        ),
        Movie(
            "Рататуй (2007)",
            "https://upload.wikimedia.org/wikipedia/ru/thumb/d/d1/Ratatui.jpg/411px-Ratatui.jpg",
            "Крысенок-кулинар попадает на кухню ресторана. Аппетитная комедия с «Оскаром» за лучший анимационный фильм"
        )
    )

    val category_anime = MovieCategory(
        "Аниме",
        animesList
    )

    val category_comedies = MovieCategory(
        "Комедии",
        comediesList
    )

    val category_cartoons = MovieCategory(
        "Мультики",
        cartoonsList
    )

    val categoriesList = listOf(
        category_anime,
        category_comedies,
        category_cartoons,
    )

}