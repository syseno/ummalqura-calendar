package com.github.msarhan.ummalqura.calendar.text;

import java.util.ListResourceBundle;

public class UmmalquraFormatData_in extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"MonthNames",
                        new String[]{
                                "Muharram",
                                "Safar",
                                "Rabiul Awal",
                                "Rabiul Akhir",
                                "Jumadil Awal",
                                "Jumadil Akhir",
                                "Rajab",
                                "Sya'ban",
                                "Ramadhan",
                                "Syawal",
                                "Dzulkaidah",
                                "Dzulhijjah"}
                },
                {"MonthAbbreviations",
                        new String[]{
                                "Muh"
                                , "Saf"
                                , "Rab-I"
                                , "Rab-II"
                                , "Jum-I"
                                , "Jum-II"
                                , "Raj"
                                , "Sya"
                                , "Ram"
                                , "Syaw"
                                , "Dzul-Q"
                                , "Dzul-H"}}
        };
    }

}
