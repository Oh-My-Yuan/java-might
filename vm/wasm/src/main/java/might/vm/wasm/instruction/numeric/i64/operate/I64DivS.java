package might.vm.wasm.instruction.numeric.i64.operate;

import might.vm.wasm.core.structure.ModuleInstance;
import might.vm.wasm.instruction.UnreadOperate;
import might.vm.wasm.model.Dump;
import might.vm.wasm.util.NumberUtil;

public class I64DivS implements UnreadOperate {

    @Override
    public void operate(ModuleInstance mi, Dump args) {
        long v2 = mi.popS64();
        long v1 = mi.popS64();
        mi.pushS64(NumberUtil.divS(v1, v2));
    }

}
