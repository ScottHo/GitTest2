//-- generated code, will be overwritten at each recompilation

package rs2d.sequence;

import rs2d.spinlab.tools.param.*;
import rs2d.spinlab.tools.table.*;
import rs2d.spinlab.sequenceGenerator.GeneratorParamEnum;

import java.util.List;
import static java.util.Arrays.asList;

public enum U implements GeneratorParamEnum {
    ACCU_DIM("ACCU_DIM") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACCU_DIM");
            param.setDisplayedName("Accumulation Dimension");
            param.setDescription("Dimension on which averaging is performed by the Cameleon");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("0122dd80-9144-4db8-8abf-76d6ca7243b9");
            param.setNumberEnum(NumberEnum.Integer);
            param.setMinValue(0);
            param.setMaxValue(3);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    ACQUISITION_MATRIX_DIMENSION_1D("ACQUISITION_MATRIX_DIMENSION_1D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACQUISITION_MATRIX_DIMENSION_1D");
            param.setDisplayedName("Acquisition 1D");
            param.setDescription("Size of the initial dataset (raw data; ACQUISITION_MATRIX_DIMENSION_1D)");
            param.setLocked(true);
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("e9401ef5-4a63-4106-a7af-f9c489feba5a");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(128);
            param.setDefaultValue(128);
            return param;
        }
    },

    ACQUISITION_MATRIX_DIMENSION_2D("ACQUISITION_MATRIX_DIMENSION_2D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACQUISITION_MATRIX_DIMENSION_2D");
            param.setDisplayedName("Acquisition 2D");
            param.setDescription("Size of the initial dataset (raw data; ACQUISITION_MATRIX_DIMENSION_2D)");
            param.setLocked(true);
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("97ac0926-6005-4587-ab6d-299ebf7446a1");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(128);
            return param;
        }
    },

    ACQUISITION_MATRIX_DIMENSION_3D("ACQUISITION_MATRIX_DIMENSION_3D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACQUISITION_MATRIX_DIMENSION_3D");
            param.setDisplayedName("Acquisition 3D");
            param.setDescription("Size of the initial dataset (raw data; ACQUISITION_MATRIX_DIMENSION_3D)");
            param.setLocked(true);
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("b582907d-8de1-4553-91da-5e971faff577");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    ACQUISITION_MATRIX_DIMENSION_4D("ACQUISITION_MATRIX_DIMENSION_4D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACQUISITION_MATRIX_DIMENSION_4D");
            param.setDisplayedName("Acquisition 4D");
            param.setDescription("Size of the initial dataset (raw data; ACQUISITION_MATRIX_DIMENSION_4D)");
            param.setLocked(true);
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("28e9eb5f-1225-4250-b9d1-6d24f60b091d");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    ACQUISITION_MODE("ACQUISITION_MODE") {
        public Param build() {
            ListTextParam param = new ListTextParam();
            param.setName("ACQUISITION_MODE");
            param.setDisplayedName("ACQUISITION_MODE");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("ef6dc6f5-a1fd-4dcd-aebe-f1bf1947258a");
            param.setValue(asList("COMPLEX", "REAL", "REAL", "REAL"));
            param.setDefaultValue(asList("COMPLEX", "REAL", "REAL", "REAL"));
            return param;
        }
    },

    ACQUISITION_TIME_PER_SCAN("ACQUISITION_TIME_PER_SCAN") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACQUISITION_TIME_PER_SCAN");
            param.setDisplayedName("Sampling time duration");
            param.setDescription("Sampling time duration, ADC time");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("d08a755a-81c3-4ab8-81a3-a1d0bcfdca47");
            param.setNumberEnum(NumberEnum.Time);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setValue(1.0);
            param.setDefaultValue(1.0);
            return param;
        }
    },

    BASE_FREQ_1("BASE_FREQ_1") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("BASE_FREQ_1");
            param.setDisplayedName("Base Freq 1 [1H]");
            param.setDescription("Base frequency of the first sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("09df9f8e-e614-4b63-a958-5fe5e3cbf3fa");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(4.001170935E8);
            return param;
        }
    },

    BASE_FREQ_2("BASE_FREQ_2") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("BASE_FREQ_2");
            param.setDisplayedName("Base Freq 2 [1H]");
            param.setDescription("Base frequency of the second sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("31fdab6e-f66f-44cd-b085-32b30cc34eb3");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    BASE_FREQ_3("BASE_FREQ_3") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("BASE_FREQ_3");
            param.setDisplayedName("Base Freq 3 [1H]");
            param.setDescription("Base frequency of the third sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("7531160f-53f4-4dab-8f93-c1fde28594e1");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    BASE_FREQ_4("BASE_FREQ_4") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("BASE_FREQ_4");
            param.setDisplayedName("Base Freq 4 [1H]");
            param.setDescription("Base frequency of the fourth sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("51fc199d-6493-4784-9c3e-bcc01f507f81");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    DATA_REPRESENTATION("DATA_REPRESENTATION") {
        public Param build() {
            ListTextParam param = new ListTextParam();
            param.setName("DATA_REPRESENTATION");
            param.setDisplayedName("DATA_REPRESENTATION");
            param.setLocked(true);
            param.setGroup(EnumGroup.Dimension);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("43dfb113-3956-45a5-b02e-43274fbb9a91");
            param.setValue(asList("COMPLEX", "REAL", "REAL", "REAL"));
            param.setDefaultValue(asList("COMPLEX", "REAL", "REAL", "REAL"));
            return param;
        }
    },

    DIGITAL_FILTER_REMOVED("DIGITAL_FILTER_REMOVED") {
        public Param build() {
            BooleanParam param = new BooleanParam();
            param.setName("DIGITAL_FILTER_REMOVED");
            param.setDisplayedName("Digital filter removed");
            param.setDescription("Data shift activated: true");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("227153b3-a0aa-482d-a48b-17d185a94c27");
            param.setValue(true);
            param.setDefaultValue(true);
            return param;
        }
    },

    DIGITAL_FILTER_SHIFT("DIGITAL_FILTER_SHIFT") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("DIGITAL_FILTER_SHIFT");
            param.setDisplayedName("Digital filter shift");
            param.setDescription("Data shift due to the digital filter");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("4d3c9f96-4180-4894-96cf-f5f04035b694");
            param.setNumberEnum(NumberEnum.Integer);
            param.setMinValue(-2147483648);
            param.setMaxValue(2147483647);
            param.setValue(18);
            param.setDefaultValue(18);
            return param;
        }
    },

    DUMMY_SCAN("DUMMY_SCAN") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("DUMMY_SCAN");
            param.setDisplayedName("Dummy Scan");
            param.setDescription("Dummy Scan performed at the beginning of the acquisition");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("30b8ad18-ad9e-4514-b6c4-452ff88c69b1");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(0);
            param.setDefaultValue(0);
            return param;
        }
    },

    DWELL_TIME("DWELL_TIME") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("DWELL_TIME");
            param.setDisplayedName("DW");
            param.setDescription("Reception dwell time");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("94da9821-e139-4e40-939c-c19b707de061");
            param.setNumberEnum(NumberEnum.Time);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setValue(8.0E-5);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    FID_RES("FID_RES") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("FID_RES");
            param.setDisplayedName("FID Res");
            param.setDescription("Resolution of FID");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("7cddb03d-3131-4924-a599-82011ceb5296");
            param.setNumberEnum(NumberEnum.FidRes);
            param.setMinValue(0.0);
            param.setMaxValue(1.7976931348623157E308);
            param.setValue(97.656);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    FID_RES_2D("FID_RES_2D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("FID_RES_2D");
            param.setDisplayedName("FID Res 2D");
            param.setDescription("Resolution of FID 2D");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("25dd6ed5-bcd4-4ee5-94db-c6ae09d4c6ee");
            param.setNumberEnum(NumberEnum.FidRes);
            param.setMinValue(0.0);
            param.setMaxValue(1.7976931348623157E308);
            param.setValue(12500.0);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    INTERMEDIATE_FREQUENCY("INTERMEDIATE_FREQUENCY") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("INTERMEDIATE_FREQUENCY");
            param.setDisplayedName("Intermediate frequency");
            param.setDescription("Sampling frequency after demodulation");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("eaa3d4cc-a50d-43f0-b7dd-e48a0161d110");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(1.26E7);
            param.setDefaultValue(1.0);
            return param;
        }
    },

    LAST_PUT("LAST_PUT") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("LAST_PUT");
            param.setDisplayedName("LAST_PUT");
            param.setDescription("LAST_PUT.description");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("32a19763-8ce4-44fa-98c4-6aafd43b67cf");
            param.setMinValue(-2147483648);
            param.setMaxValue(2147483647);
            param.setNumberEnum(NumberEnum.Integer);
            param.setValue(asListNumber(0, 0, 0, 0, 0));
            param.setDefaultValue(asListNumber(0, 0, 0, 0, 0));
            return param;
        }
    },

    LOCK("LOCK") {
        public Param build() {
            BooleanParam param = new BooleanParam();
            param.setName("LOCK");
            param.setDisplayedName("LOCK");
            param.setDescription("Acquisition lock status");
            param.setLocked(true);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("46bca42c-6a23-46a0-b9e8-1cf483e092c8");
            param.setValue(false);
            param.setDefaultValue(false);
            return param;
        }
    },

    MAGNETIC_FIELD_STRENGTH("MAGNETIC_FIELD_STRENGTH") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("MAGNETIC_FIELD_STRENGTH");
            param.setDisplayedName("B0");
            param.setDescription("Magnetic field strength");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("031bfd6d-767e-4024-96ab-85f06cd46850");
            param.setNumberEnum(NumberEnum.Integer);
            param.setMinValue(-2147483648);
            param.setMaxValue(2147483647);
            param.setValue(5);
            param.setDefaultValue(7);
            return param;
        }
    },

    MANUFACTURER("MANUFACTURER") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("MANUFACTURER");
            param.setDisplayedName("INSTRUMENT_MANUFACTURER");
            param.setDescription("Manufacturer");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("9ced814e-4a31-4274-9006-337fb7dec490");
            param.setValue("RS2D");
            param.setDefaultValue("RS2D");
            return param;
        }
    },

    MODALITY("MODALITY") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("MODALITY");
            param.setDisplayedName("Modality");
            param.setDescription("Acquisition modality: MRI, NMR...");
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("299ab081-3ecd-42a9-9b49-cf63324df9b0");
            param.setValue("NMR");
            param.setDefaultValue("NMR");
            param.setSuggestedValues(asList("NMR", "MRI", "PET", "DEFAULT"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    MODEL_NAME("MODEL_NAME") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("MODEL_NAME");
            param.setDisplayedName("INSTRUMENT_MODEL_NAME");
            param.setDescription("Model name");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("493d1b76-df02-4032-82fb-7e01f6d12e7b");
            param.setValue("");
            param.setDefaultValue("");
            return param;
        }
    },

    NUCLEUS_1("NUCLEUS_1") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("NUCLEUS_1");
            param.setDisplayedName("Nucleus 1");
            param.setDescription("Nucleus used for the first sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("11580798-c3f8-40da-a73a-0fc4fb8a49d3");
            param.setValue("1H");
            param.setDefaultValue("1H");
            param.setSuggestedValues(asList("Y", "Other", "X", "1H", "2H", "3H", "3He", "6Li", "7Li", "9Be", "10B", "11B", "13C", "14N", "15N", "17O", "19F", "21Ne", "23Na", "25Mg", "27Al", "29Si", "31P", "33S", "35Cl", "37Cl", "39K", "40K", "41K", "43Ca", "45Sc", "47Ti", "49Ti", "50V", "51V", "53Cr", "55Mn", "57Fe", "59Co", "61Ni", "63Cu", "65Cu", "67Zn", "69Ga", "71Ga", "73Ge", "75As", "77Se", "79Br", "81Br", "83Kr", "85Rb", "87Rb", "87Sr", "89Y", "91Zr", "93Nb", "95Mo", "97Mo", "99Tc", "99Ru", "101Ru", "103Rh", "105Pd", "107Ag", "109Ag", "111Cd", "113Cd", "113In", "115Sn", "115In", "117Sn", "119Sn", "121Sb", "123Te", "123Sb", "125Te", "127I", "129Xe", "131Xe", "133Cs", "135Ba", "137Ba", "138La", "139La", "141Pr", "143Nd", "145Nd", "147Sm", "149Sm", "151Eu", "153Eu", "155Gd", "157Gd", "159Tb", "161Dy", "163Dy", "165Ho", "167Er", "169Tm", "171Yb", "173Yb", "175Lu", "176Lu", "177Hf", "179Hf", "181Ta", "183W", "185Re", "187Re", "187Os", "189Os", "191Ir", "193Ir", "195Pt", "197Au", "199Hg", "201Hg", "203Tl", "205Tl", "207Pb", "209Bi", "235U"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    NUCLEUS_2("NUCLEUS_2") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("NUCLEUS_2");
            param.setDisplayedName("Nucleus 2");
            param.setDescription("Nucleus used for the second sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("89c65023-4eaf-4be1-a4e7-0a3e031229f8");
            param.setValue("1H");
            param.setDefaultValue("1H");
            param.setSuggestedValues(asList("Y", "Other", "X", "1H", "2H", "3H", "3He", "6Li", "7Li", "9Be", "10B", "11B", "13C", "14N", "15N", "17O", "19F", "21Ne", "23Na", "25Mg", "27Al", "29Si", "31P", "33S", "35Cl", "37Cl", "39K", "40K", "41K", "43Ca", "45Sc", "47Ti", "49Ti", "50V", "51V", "53Cr", "55Mn", "57Fe", "59Co", "61Ni", "63Cu", "65Cu", "67Zn", "69Ga", "71Ga", "73Ge", "75As", "77Se", "79Br", "81Br", "83Kr", "85Rb", "87Rb", "87Sr", "89Y", "91Zr", "93Nb", "95Mo", "97Mo", "99Tc", "99Ru", "101Ru", "103Rh", "105Pd", "107Ag", "109Ag", "111Cd", "113Cd", "113In", "115Sn", "115In", "117Sn", "119Sn", "121Sb", "123Te", "123Sb", "125Te", "127I", "129Xe", "131Xe", "133Cs", "135Ba", "137Ba", "138La", "139La", "141Pr", "143Nd", "145Nd", "147Sm", "149Sm", "151Eu", "153Eu", "155Gd", "157Gd", "159Tb", "161Dy", "163Dy", "165Ho", "167Er", "169Tm", "171Yb", "173Yb", "175Lu", "176Lu", "177Hf", "179Hf", "181Ta", "183W", "185Re", "187Re", "187Os", "189Os", "191Ir", "193Ir", "195Pt", "197Au", "199Hg", "201Hg", "203Tl", "205Tl", "207Pb", "209Bi", "235U"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    NUCLEUS_3("NUCLEUS_3") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("NUCLEUS_3");
            param.setDisplayedName("Nucleus 3");
            param.setDescription("Nucleus used for the third sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("c7aab2fb-346f-416e-b136-e63ff27a4b2e");
            param.setValue("1H");
            param.setDefaultValue("1H");
            param.setSuggestedValues(asList("Y", "Other", "X", "1H", "2H", "3H", "3He", "6Li", "7Li", "9Be", "10B", "11B", "13C", "14N", "15N", "17O", "19F", "21Ne", "23Na", "25Mg", "27Al", "29Si", "31P", "33S", "35Cl", "37Cl", "39K", "40K", "41K", "43Ca", "45Sc", "47Ti", "49Ti", "50V", "51V", "53Cr", "55Mn", "57Fe", "59Co", "61Ni", "63Cu", "65Cu", "67Zn", "69Ga", "71Ga", "73Ge", "75As", "77Se", "79Br", "81Br", "83Kr", "85Rb", "87Rb", "87Sr", "89Y", "91Zr", "93Nb", "95Mo", "97Mo", "99Tc", "99Ru", "101Ru", "103Rh", "105Pd", "107Ag", "109Ag", "111Cd", "113Cd", "113In", "115Sn", "115In", "117Sn", "119Sn", "121Sb", "123Te", "123Sb", "125Te", "127I", "129Xe", "131Xe", "133Cs", "135Ba", "137Ba", "138La", "139La", "141Pr", "143Nd", "145Nd", "147Sm", "149Sm", "151Eu", "153Eu", "155Gd", "157Gd", "159Tb", "161Dy", "163Dy", "165Ho", "167Er", "169Tm", "171Yb", "173Yb", "175Lu", "176Lu", "177Hf", "179Hf", "181Ta", "183W", "185Re", "187Re", "187Os", "189Os", "191Ir", "193Ir", "195Pt", "197Au", "199Hg", "201Hg", "203Tl", "205Tl", "207Pb", "209Bi", "235U"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    NUCLEUS_4("NUCLEUS_4") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("NUCLEUS_4");
            param.setDisplayedName("Nucleus 4");
            param.setDescription("Nucleus used for the fourth sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("12727126-a2f9-4ae5-b94e-bef79fcf7dc3");
            param.setValue("1H");
            param.setDefaultValue("1H");
            param.setSuggestedValues(asList("Y", "Other", "X", "1H", "2H", "3H", "3He", "6Li", "7Li", "9Be", "10B", "11B", "13C", "14N", "15N", "17O", "19F", "21Ne", "23Na", "25Mg", "27Al", "29Si", "31P", "33S", "35Cl", "37Cl", "39K", "40K", "41K", "43Ca", "45Sc", "47Ti", "49Ti", "50V", "51V", "53Cr", "55Mn", "57Fe", "59Co", "61Ni", "63Cu", "65Cu", "67Zn", "69Ga", "71Ga", "73Ge", "75As", "77Se", "79Br", "81Br", "83Kr", "85Rb", "87Rb", "87Sr", "89Y", "91Zr", "93Nb", "95Mo", "97Mo", "99Tc", "99Ru", "101Ru", "103Rh", "105Pd", "107Ag", "109Ag", "111Cd", "113Cd", "113In", "115Sn", "115In", "117Sn", "119Sn", "121Sb", "123Te", "123Sb", "125Te", "127I", "129Xe", "131Xe", "133Cs", "135Ba", "137Ba", "138La", "139La", "141Pr", "143Nd", "145Nd", "147Sm", "149Sm", "151Eu", "153Eu", "155Gd", "157Gd", "159Tb", "161Dy", "163Dy", "165Ho", "167Er", "169Tm", "171Yb", "173Yb", "175Lu", "176Lu", "177Hf", "179Hf", "181Ta", "183W", "185Re", "187Re", "187Os", "189Os", "191Ir", "193Ir", "195Pt", "197Au", "199Hg", "201Hg", "203Tl", "205Tl", "207Pb", "209Bi", "235U"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    NUMBER_OF_AVERAGES("NUMBER_OF_AVERAGES") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("NUMBER_OF_AVERAGES");
            param.setDisplayedName("Number of averages");
            param.setDescription("Number of average");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("df0168b2-7f88-406c-86fc-24664e9673a5");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    Nb_2d("Nb_2d") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("Nb_2d");
            param.setDisplayedName("Nb_2d");
            param.setGroup(EnumGroup.Dimension);
            param.setCategory(Category.Acquisition);
            param.setUuid("e1fe6910-4bbd-42b1-a5c8-09be10f57d9f");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    Nb_3d("Nb_3d") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("Nb_3d");
            param.setDisplayedName("Nb_3d");
            param.setGroup(EnumGroup.Dimension);
            param.setCategory(Category.Acquisition);
            param.setUuid("a3c39ad8-e260-4b82-a7da-ca63dc6e428c");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    Nb_4d("Nb_4d") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("Nb_4d");
            param.setDisplayedName("Nb_4d");
            param.setGroup(EnumGroup.Dimension);
            param.setCategory(Category.Acquisition);
            param.setUuid("325c4181-fd97-4e23-823c-d44957c26d24");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    OBSERVED_FREQUENCY("OBSERVED_FREQUENCY") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("OBSERVED_FREQUENCY");
            param.setDisplayedName("Observed frequency");
            param.setDescription("Frequency of the acquisition");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("9c3bac60-298f-4b6d-8421-120511b64ea5");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(6.3E7);
            return param;
        }
    },

    OBSERVED_NUCLEUS("OBSERVED_NUCLEUS") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("OBSERVED_NUCLEUS");
            param.setDisplayedName("Observed Nucleus");
            param.setDescription("Observed nucleus");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("579870e6-81f4-4dc4-8ed4-40c0cd255fa0");
            param.setValue("1H");
            param.setDefaultValue("1H");
            param.setSuggestedValues(asList("Y", "Other", "X", "1H", "2H", "3H", "3He", "6Li", "7Li", "9Be", "10B", "11B", "13C", "14N", "15N", "17O", "19F", "21Ne", "23Na", "25Mg", "27Al", "29Si", "31P", "33S", "35Cl", "37Cl", "39K", "40K", "41K", "43Ca", "45Sc", "47Ti", "49Ti", "50V", "51V", "53Cr", "55Mn", "57Fe", "59Co", "61Ni", "63Cu", "65Cu", "67Zn", "69Ga", "71Ga", "73Ge", "75As", "77Se", "79Br", "81Br", "83Kr", "85Rb", "87Rb", "87Sr", "89Y", "91Zr", "93Nb", "95Mo", "97Mo", "99Tc", "99Ru", "101Ru", "103Rh", "105Pd", "107Ag", "109Ag", "111Cd", "113Cd", "113In", "115Sn", "115In", "117Sn", "119Sn", "121Sb", "123Te", "123Sb", "125Te", "127I", "129Xe", "131Xe", "133Cs", "135Ba", "137Ba", "138La", "139La", "141Pr", "143Nd", "145Nd", "147Sm", "149Sm", "151Eu", "153Eu", "155Gd", "157Gd", "159Tb", "161Dy", "163Dy", "165Ho", "167Er", "169Tm", "171Yb", "173Yb", "175Lu", "176Lu", "177Hf", "179Hf", "181Ta", "183W", "185Re", "187Re", "187Os", "189Os", "191Ir", "193Ir", "195Pt", "197Au", "199Hg", "201Hg", "203Tl", "205Tl", "207Pb", "209Bi", "235U"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    OFFSET_FREQ_1("OFFSET_FREQ_1") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("OFFSET_FREQ_1");
            param.setDisplayedName("Offset 1 [1H]");
            param.setDescription("Offset frequency of the first sequence channel");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("e69845bb-eb5d-4605-84bc-ef03ec03e907");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("09df9f8e-e614-4b63-a958-5fe5e3cbf3fa");
            return param;
        }
    },

    OFFSET_FREQ_2("OFFSET_FREQ_2") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("OFFSET_FREQ_2");
            param.setDisplayedName("Offset 2 [1H]");
            param.setDescription("Offset frequency of the second sequence channel");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("15d8fb5a-dc1c-4033-8c36-31cef652f091");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("31fdab6e-f66f-44cd-b085-32b30cc34eb3");
            return param;
        }
    },

    OFFSET_FREQ_3("OFFSET_FREQ_3") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("OFFSET_FREQ_3");
            param.setDisplayedName("Offset 3 [1H]");
            param.setDescription("Offset frequency of the third sequence channel");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("957c8486-aa7f-4a03-a3fe-762999fb32c8");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("7531160f-53f4-4dab-8f93-c1fde28594e1");
            return param;
        }
    },

    OFFSET_FREQ_4("OFFSET_FREQ_4") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("OFFSET_FREQ_4");
            param.setDisplayedName("Offset 4 [1H]");
            param.setDescription("Offset frequency of the fourth sequence channel");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("da24045a-56cd-4797-8d91-55b57b25011e");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("51fc199d-6493-4784-9c3e-bcc01f507f81");
            return param;
        }
    },

    PAROPT_PARAM("PAROPT_PARAM") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("PAROPT_PARAM");
            param.setDisplayedName("Parameter optimised");
            param.setDescription("Name of the current optimised parameter");
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("0decfc16-a326-4d5b-9fd1-31eeeb3fb444");
            param.setValue("PULSE_LENGTH");
            param.setDefaultValue("PULSE_LENGTH");
            return param;
        }
    },

    PHASE_0("PHASE_0") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("PHASE_0");
            param.setDisplayedName("PHASE_0");
            param.setDescription("PHASE_0.description");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Process);
            param.setUuid("751d6c65-7d96-47e9-85dd-20bdf29be5a6");
            param.setMinValue(-1.7976931348623157E308);
            param.setMaxValue(1.7976931348623157E308);
            param.setNumberEnum(NumberEnum.Double);
            param.setValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            param.setDefaultValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            return param;
        }
    },

    PHASE_1("PHASE_1") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("PHASE_1");
            param.setDisplayedName("PHASE_1");
            param.setDescription("PHASE_1.description");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Process);
            param.setUuid("a8218408-a2f8-4af9-98c6-a73c777894a2");
            param.setMinValue(-1.7976931348623157E308);
            param.setMaxValue(1.7976931348623157E308);
            param.setNumberEnum(NumberEnum.Double);
            param.setValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            param.setDefaultValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            return param;
        }
    },

    PHASE_APPLIED("PHASE_APPLIED") {
        public Param build() {
            BooleanParam param = new BooleanParam();
            param.setName("PHASE_APPLIED");
            param.setDisplayedName("PHASE_APPLIED");
            param.setDescription("PHASE_APPLIED");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Process);
            param.setUuid("d6eb3e8e-9b68-41ca-bee3-cfc464d636ad");
            param.setValue(false);
            param.setDefaultValue(false);
            return param;
        }
    },

    PHASE_MOD("PHASE_MOD") {
        public Param build() {
            ListTextParam param = new ListTextParam();
            param.setName("PHASE_MOD");
            param.setDisplayedName("PHASE_MOD");
            param.setDescription("Phase Modulation Method, descriptive parameter that is meant to be used at the processing step.");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Process);
            param.setUuid("64dc9b28-ad1c-4e6c-9af6-281bddaca177");
            param.setValue(asList("NONE", "NONE", "NONE", "NONE"));
            param.setDefaultValue(asList("NONE", "NONE", "NONE", "NONE"));
            return param;
        }
    },

    PROBES("PROBES") {
        public Param build() {
            ListTextParam param = new ListTextParam();
            param.setName("PROBES");
            param.setDisplayedName("INSTRUMENT_PROBES");
            param.setDescription("The probes used for the acquisition.");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("2f425e8c-1419-455c-9392-efc8f03f393a");
            return param;
        }
    },

    Pre_scan("Pre_scan") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("Pre_scan");
            param.setDisplayedName("Pre_scan");
            param.setDescription("PreScan");
            param.setGroup(EnumGroup.Dimension);
            param.setCategory(Category.Acquisition);
            param.setUuid("b1886597-e185-4088-9b87-f895ce7a5d90");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(0);
            param.setDefaultValue(0);
            return param;
        }
    },

    RECEIVER_COUNT("RECEIVER_COUNT") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("RECEIVER_COUNT");
            param.setDisplayedName("Receiver Count");
            param.setDescription("Number of receivers channel");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("7a72efb4-028e-44a3-b138-145ed6135131");
            param.setNumberEnum(NumberEnum.Integer);
            param.setMinValue(1);
            param.setMaxValue(32);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    RECEIVER_GAIN("RECEIVER_GAIN") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("RECEIVER_GAIN");
            param.setDisplayedName("RG");
            param.setDescription("Receiver gain");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("4f26405c-34b5-44e1-a566-019411707a6b");
            param.setMinValue(0.0);
            param.setMaxValue(120.0);
            param.setNumberEnum(NumberEnum.RxGain);
            param.setValue(asListNumber(30.0));
            param.setDefaultValue(asListNumber(30.0));
            return param;
        }
    },

    SAMPLE_TEMPERATURE("SAMPLE_TEMPERATURE") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("SAMPLE_TEMPERATURE");
            param.setDisplayedName("Sample temperature");
            param.setDescription("SAMPLE_TEMPERATURE.description");
            param.setGroup(EnumGroup.Sample);
            param.setCategory(Category.Acquisition);
            param.setUuid("2334b486-960a-456f-a415-1809bdaccd1b");
            param.setNumberEnum(NumberEnum.Temperature);
            param.setMinValue(0.0);
            param.setMaxValue(700.0);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    SEQUENCE_NAME("SEQUENCE_NAME") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("SEQUENCE_NAME");
            param.setDisplayedName("Sequence");
            param.setDescription("Name of the sequence");
            param.setLocked(true);
            param.setLockedToDefault(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("ae24aef1-9ab3-4fa4-b17b-ac2c6625ecd6");
            param.setValue("simple1");
            param.setDefaultValue("simple1");
            return param;
        }
    },

    SETUP_MODE("SETUP_MODE") {
        public Param build() {
            BooleanParam param = new BooleanParam();
            param.setName("SETUP_MODE");
            param.setDisplayedName("Setup");
            param.setDescription("True during setup process");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("dd610583-bdc8-49ed-99ae-885106de245d");
            param.setValue(false);
            param.setDefaultValue(false);
            return param;
        }
    },

    SOFTWARE_VERSION("SOFTWARE_VERSION") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("SOFTWARE_VERSION");
            param.setDisplayedName("INSTRUMENT_SOFTWARE_VERSION");
            param.setDescription("Version of the software");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("227eedb0-1caf-4c58-a00c-f27218d5a882");
            param.setValue("");
            param.setDefaultValue("");
            return param;
        }
    },

    SOLVENT("SOLVENT") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("SOLVENT");
            param.setDisplayedName("Solvent");
            param.setDescription("Solvent used");
            param.setLocked(true);
            param.setGroup(EnumGroup.Sample);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("7deabfd2-2902-4a2c-817f-8aba6cab4f7b");
            param.setValue("CDCl3");
            param.setDefaultValue("CDCl3");
            return param;
        }
    },

    SPECTRAL_WIDTH("SPECTRAL_WIDTH") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("SPECTRAL_WIDTH");
            param.setDisplayedName("SW");
            param.setDescription("Reception bandwidth");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("7d323371-07e2-451e-aac2-9dbd69f04f34");
            param.setNumberEnum(NumberEnum.SW);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E8);
            param.setValue(12500.0);
            param.setDefaultValue(12500.0);
            param.setInitialNumberEnum(NumberEnum.SW);
            param.setUuidBaseFrequency("9c3bac60-298f-4b6d-8421-120511b64ea5");
            return param;
        }
    },

    SPECTRAL_WIDTH_2D("SPECTRAL_WIDTH_2D") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("SPECTRAL_WIDTH_2D");
            param.setDisplayedName("SW 2D");
            param.setDescription("Spectral width in the second dimension");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("a5e503a5-2bc5-4885-ae8d-aec59dca6361");
            param.setNumberEnum(NumberEnum.SW);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E8);
            param.setValue(12500.0);
            param.setDefaultValue(12500.0);
            param.setInitialNumberEnum(NumberEnum.SW);
            param.setUuidBaseFrequency("4c5d8c56-e6ba-4edf-aebc-697756a70bcc");
            return param;
        }
    },

    SPECTRAL_WIDTH_3D("SPECTRAL_WIDTH_3D") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("SPECTRAL_WIDTH_3D");
            param.setDisplayedName("SW 3D");
            param.setDescription("Spectral width in the third dimension");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("b82f7b45-f5bc-4a47-97e5-d07a3ee590d6");
            param.setNumberEnum(NumberEnum.SW);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E8);
            param.setValue(12500.0);
            param.setDefaultValue(12500.0);
            param.setInitialNumberEnum(NumberEnum.SW);
            param.setUuidBaseFrequency("9c3bac60-298f-4b6d-8421-120511b64ea5");
            return param;
        }
    },

    SPIN_RATE("SPIN_RATE") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("SPIN_RATE");
            param.setDisplayedName("Spin Rate");
            param.setDescription("SPIN_RATE.description");
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("ddaebf18-aec1-443a-9c0e-9279d41f0795");
            param.setNumberEnum(NumberEnum.Integer);
            param.setMinValue(-2147483648);
            param.setMaxValue(2147483647);
            param.setValue(0);
            param.setDefaultValue(0);
            return param;
        }
    },

    SR("SR") {
        public Param build() {
            HzPpmListNumberParam param = new HzPpmListNumberParam();
            param.setName("SR");
            param.setDisplayedName("SR");
            param.setDescription("Chemical reference");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("b3450c42-202b-4ed8-b73a-013f34e1ad15");
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            param.setDefaultValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("9c3bac60-298f-4b6d-8421-120511b64ea5");
            return param;
        }
    },

    STATION_NAME("STATION_NAME") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("STATION_NAME");
            param.setDisplayedName("INSTRUMENT_STATION_NAME");
            param.setDescription("Station name");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("3bc3ea7e-2081-4bfd-8ce5-a536efb5c646");
            param.setValue("");
            param.setDefaultValue("");
            return param;
        }
    },

    TRANSFORM_PLUGIN("TRANSFORM_PLUGIN") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("TRANSFORM_PLUGIN");
            param.setDisplayedName("Transform plugin");
            param.setDescription("Plugin to reorder the sample into the dataset");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("989f3804-92a7-428e-b064-d934077d5a30");
            param.setValue("none");
            param.setDefaultValue("none");
            param.setSuggestedValues(asList("Bordered2D", "Bordered2D_FSE", "Centered2D", "Centered2D_FSE", "Centered2D_FSERot", "Centered2DRot", "EchoAntiechoTransform", "MapShim3DTransform", "SEEPISequential", "Sequential", "Sequential2D", "Sequential2DInterleaved", "Sequential4D", "Sequential4D_Dummy2D", "Sequential4DBackAndForth", "Sequential4DCine"));
            return param;
        }
    },

    TRANSMIT_FREQ_1("TRANSMIT_FREQ_1") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("TRANSMIT_FREQ_1");
            param.setDisplayedName("Transmit 1 [1H]");
            param.setDescription("Transmit frequency of the first sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("0eb5585a-1768-4b35-9922-cef8e36bdccf");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(4.001170935E8);
            return param;
        }
    },

    TRANSMIT_FREQ_2("TRANSMIT_FREQ_2") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("TRANSMIT_FREQ_2");
            param.setDisplayedName("Transmit 2 [1H]");
            param.setDescription("Transmit frequency of the second sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("4c5d8c56-e6ba-4edf-aebc-697756a70bcc");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    TRANSMIT_FREQ_3("TRANSMIT_FREQ_3") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("TRANSMIT_FREQ_3");
            param.setDisplayedName("Transmit 3 [1H]");
            param.setDescription("Transmit frequency of the third sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("353efcfb-39e0-48bb-8fe7-e14bfd63b1f1");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    TRANSMIT_FREQ_4("TRANSMIT_FREQ_4") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("TRANSMIT_FREQ_4");
            param.setDisplayedName("Transmit 4 [1H]");
            param.setDescription("Transmit frequency of the fourth sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("f530e50a-b6b0-492b-b009-35902741f665");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    TX_ROUTE("TX_ROUTE") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("TX_ROUTE");
            param.setDisplayedName("TX_ROUTE");
            param.setDescription("LogCh->PhysCh");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("50627253-53a9-4cb7-9ff8-ba7f46cfb9fd");
            param.setMinValue(-2147483648);
            param.setMaxValue(2147483647);
            param.setNumberEnum(NumberEnum.Integer);
            param.setValue(asListNumber(0));
            return param;
        }
    },

    USER_MATRIX_DIMENSION_1D("USER_MATRIX_DIMENSION_1D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("USER_MATRIX_DIMENSION_1D");
            param.setDisplayedName("Matrix 1D");
            param.setDescription("Matrix size (USER_MATRIX_DIMENSION_1D)");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("ac7e3c15-cbf7-4211-8d1f-71e1eb94457e");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(128);
            param.setDefaultValue(128);
            return param;
        }
    },

    USER_MATRIX_DIMENSION_2D("USER_MATRIX_DIMENSION_2D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("USER_MATRIX_DIMENSION_2D");
            param.setDisplayedName("Matrix 2D");
            param.setDescription("Matrix size (USER_MATRIX_DIMENSION_2D)");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("467812fc-043c-425a-8d9d-ae2a3502c317");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(128);
            param.setDefaultValue(128);
            return param;
        }
    },

    USER_MATRIX_DIMENSION_3D("USER_MATRIX_DIMENSION_3D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("USER_MATRIX_DIMENSION_3D");
            param.setDisplayedName("Matrix 3D");
            param.setDescription("Matrix size (USER_MATRIX_DIMENSION_3D)");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("b9fef0aa-dd90-41e0-bc6d-357d97490536");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    USER_MATRIX_DIMENSION_4D("USER_MATRIX_DIMENSION_4D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("USER_MATRIX_DIMENSION_4D");
            param.setDisplayedName("Matrix 4D");
            param.setDescription("Matrix size (USER_MATRIX_DIMENSION_4D)");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("3e52d122-097d-4adf-ad20-082af6611efc");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    };

    //--

    private final String name;

    private U(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    //--

    private static List<Number> asListNumber(Number ... numbers) {
        return asList(numbers);
    }
}
