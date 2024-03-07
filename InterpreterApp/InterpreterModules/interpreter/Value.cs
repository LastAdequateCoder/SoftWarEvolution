using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterpreterModules.interpreter
{
    internal class Value
    {
        public string Val { get; private set; }
        public string Picture { get; private set; }
        internal Value(string value, string picture)
        {
            Val = value;
            Picture = picture;
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
    }
}
