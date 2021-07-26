package might.vm.wasm.core2.instruction.parametric;

import might.vm.wasm.core2.instruction.Operate;
import might.vm.wasm.model.Dump;
import might.vm.wasm.model.type.Types;
import might.vm.wasm.core2.structure.WasmReader;

public class SelectC implements Operate {

    @Override
    public Dump read(WasmReader reader) {
        return new Types(reader.readValueTypes());
    }

}
