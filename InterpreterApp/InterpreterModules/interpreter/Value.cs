using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace InterpreterModules.interpreter
{
    internal class Value
    {
        //Why private setters, but public assign methods?
        public string Val { get; private set; }
        public string Picture { get; private set; }
        internal Value(string value, string picture)
        {
            Val = value;
            Picture = picture;
        }

        internal Value(){
            Val = null;
            Picture = null;
        }

        #region Assign value methods
        public void AssignValue(string value) => Val = value;
        public void AssignPicture(string picture) => Picture = picture;
        #endregion

        /// <summary>
        /// Checks if Picture is numeric
        /// </summary>
        /// <returns></returns>
        public bool IsNumerical()
        {
            for(int i = 0; i < Picture.Length; i++)
            {
                char c = Picture[i];
                if (char.IsDigit(c))
                    continue;
                return false;
            }
            return true;
        }

        public static String MakeValueByPicture(String picture){
            String val = "";
            for (int i = 0; i < picture.Count(); i++)
            {
                if (picture[i] == '9')
                    val+="0";
                else if (picture[i] == 'A' || picture[i] == 'Z' || picture[i] == 'X' || picture[i] == 'S')
                    val+=" ";
                else if (picture[i] == 'V')
                    val+=".";
            }
            return val;
        }

        public static bool CheckValueWithPicture([NotNull]string val, string picture)
        {
            if (val.Count() != picture.Count()){
                return false;
            }

            for (int i = 0; i < val.Count(); i++)
            {
                if (picture[i] == 'Z' || picture[i] == '9'){
                    try{
                        ReadOnlySpan<char> c = val[i].ToString();
                        int.Parse(c);
                    }
                    catch(Exception ex){
                        return false;
                    }
                }
                else if (picture[i] == 'A'){
                    if (!char.IsLetter(val[i]))
                        return false;
                }
                else if (picture[i] == 'S'){
                    if (val[i] != '+' && val[i] != '-' && val[i] != '+'){
                        return false;
                    }
                }
                else if (picture[i] == 'V'){
                    if (val[i] != '.' && val[i] != ','){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
